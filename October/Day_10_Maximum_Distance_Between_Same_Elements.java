class Solution {
    public int maxDistance(int[] arr) {
        Map<Integer, Integer> start = new HashMap<>();
        Map<Integer, Integer> end = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            
            if (!start.containsKey(num)) start.put(num, i);
            end.put(num, i);
        }
        
        
        int max = 0;
        for (int key : start.keySet()) {
            int diff = end.get(key)-start.get(key);
            
            max = diff > max ? diff : max;
        }
        
        return max;
    }
}