class Solution {
    int countFreq(int[] arr, int target) {
        int index = binarySearch(arr, target);
        
        if (index == -1) return 0;
        else {
            int start = index, end = index;
            while (start > 0 && arr[start-1] == target) start--;
            while (end < arr.length-1 && arr[end+1] == target) end++;
            
            return end-start+1;
        }
    }
    
    int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        
        while (start <= end) {
            int mid = (start+end)/2;
            
            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) end = mid-1;
            else start = mid+1;
        }
        
        return -1;
    }
}