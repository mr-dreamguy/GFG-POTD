class Solution {
    public long maxSum(Long[] arr) {
        long sum = 0;
        int n = arr.length;
        Arrays.sort(arr);
        
        for (int i = 0; i < n; i++) {
            sum += Math.abs(arr[i] - arr[n - i - 1]);
        }
        
        return sum;
    }
}