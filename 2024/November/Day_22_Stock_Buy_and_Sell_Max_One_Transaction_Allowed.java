class Solution {
    public int maximumProfit(int arr[]) {
        int maxProfit = 0;
        int buy = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < buy) buy = arr[i];
            else {
                maxProfit = Math.max(maxProfit, arr[i]-buy);
            }
        }
        
        return maxProfit;
    }
}