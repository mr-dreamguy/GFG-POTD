class Solution {
    boolean twoSum(int arr[], int target) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            int rem = target - num;
            if (set.contains(rem)) return true;
            set.add(num);
        }
        
        return false;
    }
}