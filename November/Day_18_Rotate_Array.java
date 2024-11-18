class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d %= n;
        if (d == 0) return;
        
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }
    
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            arr[start] += arr[end] - (arr[end] = arr[start]);
            start++;
            end--;
        }
    }
}