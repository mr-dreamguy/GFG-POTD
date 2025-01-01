class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        
        for (String s : arr) {
            String key = getSortedString(s);
            
            if (!map.containsKey(key)) map.put(key, new ArrayList<String>());
            map.get(key).add(s);
        }
        
        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        for (String key : keys) {
            list.add(map.get(key));
        }
        
        return list;
    }
    
    private String getSortedString(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        
        return new String(arr);
    }
}