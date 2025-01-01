class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int[] arr) {
        int n = arr.length;
        
        int maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE;
        int currMaxSum = 0, currMinSum = 0;
        
        int totalSum = 0;
        
        for(int i = 0; i < n; ++i){
            totalSum += arr[i];
            
            currMaxSum += arr[i];
            maxSum = Math.max(maxSum, currMaxSum);
            if(currMaxSum < 0) currMaxSum = 0;
            
            currMinSum += arr[i];
            minSum = Math.min(minSum, currMinSum);
            if(currMinSum > 0) currMinSum = 0;
        }
        
        return Math.max(maxSum, totalSum - minSum);
    }
}