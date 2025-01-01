class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (i > k) list.remove(0);
            if (!list.contains(arr[i])) list.add(arr[i]);
            else return true;
        }
        
        return false;
    }
}