class Solution {
    public int kthMissing(int[] arr, int k) {
        int left = 0, right = arr.length-1;
        
        while (left <= right) {
            int mid = (left+right)/2;
            
            if (arr[mid]-mid-1 >= k) right = mid-1;
            else left = mid+1;
        }
        
        return left+k;
    }
}