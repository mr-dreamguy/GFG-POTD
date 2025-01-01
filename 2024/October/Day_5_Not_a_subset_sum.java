class Solution {
    public long findSmallest(int[] arr) {
        long sum = 1;
        
        for (int num : arr) {
            if (num <= sum) sum += num;
            else return sum;
        }
        
        return sum;
    }
}