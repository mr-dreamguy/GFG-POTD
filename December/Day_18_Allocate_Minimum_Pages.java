class Solution {
    // Function to find minimum number of pages.
    static boolean isPossible(int[] arr, int m, int max) {
        int numStudents = 1;
        int currLoad = 0;
        
        for (int num : arr) {
            if (num + currLoad <= max) currLoad += num;
            else {
                currLoad = num;
                numStudents++;
            }
        }
        
        return numStudents <= m;
    }
    
    public static int findPages(int[] arr, int m) {
        int n = arr.length;
        if (n < m) return -1;
        
        int low = 0;
        int high = 0;
        
        for (int num : arr) {
            low = low < num ? num : low;
            high += num;
        }
        
        while (low <= high) {
            int mid = low + (high-low)/2;
            if (isPossible(arr, m, mid)) high = mid-1;
            else low = mid+1;
        }
        
        return low;
    }    
}