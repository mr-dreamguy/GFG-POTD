class Solution {
    public int findMin(int[] arr) {
        int start = 0, end = arr.length-1;
        int result = Integer.MAX_VALUE;
        
        while (start <= end) {
            int mid = (start+end)/2;
            result = Math.min(result, arr[mid]);
            
            if (arr[start] <= arr[mid]) {
                result = Math.min(result, arr[start]);
                start = mid+1;
            } else {
                result = Math.min(result, arr[mid+1]);
                end = mid-1;
            }
        }
        
        return result;
    }
}