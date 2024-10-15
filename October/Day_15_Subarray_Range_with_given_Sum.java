class Solution {
    // Function to count the number of subarrays which adds to the given sum.
    static int subArraySum(int arr[], int tar) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        map.put(0, 1);
        
        for (int num : arr) {
            sum += num;
            
            if (map.containsKey(sum-tar)) count += map.get(sum-tar);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}