class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        int left = 0, right = arr.length-1;
        int temp;
        for (int i = 0; i <= right; ) {
            if (arr[i] == 0) {
                temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                left++;
                i++;
            } else if (arr[i] == 2) {
                temp = arr[i];
                arr[i] = arr[right];
                arr[right] = temp;
                right--;
            } else i++;
        }
    }
}