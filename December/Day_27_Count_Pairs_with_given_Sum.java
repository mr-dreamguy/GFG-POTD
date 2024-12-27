class Solution {

    int countPairs(int arr[], int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        for (int num : arr) {
            count += map.getOrDefault(target-num, 0);
            map.merge(num, 1, Integer::sum);
        }
        
        return count;
    }
}