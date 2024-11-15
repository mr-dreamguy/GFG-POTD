class Solution {
    public int getSecondLargest(int[] arr) {
        int first = -1;
        int second = -1;
        
        for (int num : arr) {
            if (num == first) continue;
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second) {
                second = num;
            }
        }
        
        return second;
    }
}