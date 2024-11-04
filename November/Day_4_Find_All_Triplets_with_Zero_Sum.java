class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        Map<Integer, List<int[]>> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int sum = arr[i]+arr[j];
                
                if (!map.containsKey(sum)) map.put(sum, new ArrayList<>());
                map.get(sum).add(new int[] {i, j});
            }
        }
        
        Set<List<Integer>> set = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            int rem = -arr[i];
            
            if (map.containsKey(rem)) {
                for (int[] pair : map.get(rem)) {
                    if (pair[0] == i || pair[1] == i) continue;

                    List<Integer> triplet = Arrays.asList(i, pair[0], pair[1]);
                    Collections.sort(triplet);
                    set.add(triplet);
                }
            }
        }
        
        return new ArrayList<>(set);
    }
}