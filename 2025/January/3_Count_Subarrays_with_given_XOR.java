class Solution {
    public long subarrayXor(int arr[], int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int xor = 0;
        
        for (int num : arr) {
            xor ^= num;
            if (map.containsKey(xor ^ k)) count += map.get(xor ^ k);
            if (xor == k) count++;
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        
        return count;
    }
}