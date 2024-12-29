class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        if (a.length > b.length) return intersectionWithDuplicates(b, a);
        
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int num : a) set.add(num);
        for (int num : b) {
            if (set.contains(num)) {
                list.add(num);
                set.remove(num);
            }
        }
        
        return list;
    }
}