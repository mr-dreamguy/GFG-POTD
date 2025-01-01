class Solution {
    public boolean findTriplet(int[] arr) {
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            int k = i-1;
            
            while (j < k) {
                int sum = arr[j]+arr[k];
                
                if (sum == arr[i]) return true;
                if (sum < arr[i]) j++;
                else k--;
            }
        }
        
        return false;
    }
}