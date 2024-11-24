class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {
        int max_sum = Integer.MIN_VALUE;
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            max_sum = Math.max(max_sum, sum);
            sum = Math.max(sum, 0);
        }
        
        return max_sum;
    }
}
