class Solution {
    public static int pairsum(int[] arr) {
        int first = arr[0] > arr[1] ? arr[0] : arr[1];
        int second = arr[0]+arr[1] - first;
        
        for (int i = 2; i < arr.length; i++) {
            if (first <= arr[i]) {
                second = first;
                first = arr[i];
            } else if (second <= arr[i]) second = arr[i];
        }
        
        return first+second;
    }
}
