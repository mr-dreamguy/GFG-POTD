class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        int currMax, currMin, maxProduct;
        currMax = currMin = maxProduct = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }
            
            currMax = Math.max(currMax*arr[i], arr[i]);
            currMin = Math.min(currMin*arr[i], arr[i]);
            
            maxProduct = Math.max(currMax, maxProduct);
        }
        
        return maxProduct;
    }
}
