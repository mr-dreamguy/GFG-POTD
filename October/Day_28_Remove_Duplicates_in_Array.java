class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        boolean[] hash = new boolean[101];
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int num : arr) {
            if(hash[num]) continue;

            hash[num] = true;
            list.add(num);
        }
        
        return list;
    }
}