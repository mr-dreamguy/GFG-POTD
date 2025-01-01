class Solution {
    void nextPermutation(int[] arr) {
        int index = -1;
        int n = arr.length;
        
        for (int i = n-2; i >= 0; i--) {
            if (arr[i] < arr[i+1]) {
                index = i;
                break;
            }
        }
        
        if (index == -1) {
            reverse(arr, 0, n-1);
            return ;
        }
        
        for (int i = n-1; i > index; i--) {
            if (arr[i] > arr[index]) {
                swap(arr, i, index);
                break;
            }
        }
        
        reverse(arr, index+1, n-1);
    }

    private void swap( int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void reverse( int[] arr, int st, int end) {
        while (st < end) {
            swap(arr, st++, end--);
        }
    }
}