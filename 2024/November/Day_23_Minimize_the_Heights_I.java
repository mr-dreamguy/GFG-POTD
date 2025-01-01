// User function Template for Java
class Solution {
    public int getMinDiff(int k, int[] arr) {
        Arrays.sort(arr);
        
        int n = arr.length;
        int difference = arr[n-1]-arr[0];
        
        for (int i = 1; i < n; i++) {
            int max = Math.max(arr[n-1]-k, arr[i-1]+k);
            int min = Math.min(arr[0]+k, arr[i]-k);
            
            difference = Math.min(difference, max-min);
        }
        
        return difference;
    }
}