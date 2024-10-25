class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = arr.length-1;
        
        Arrays.sort(arr);
        while (i <= j) {
            list.add(arr[j]);
            if (i != j) list.add(arr[i]);
            
            i++;
            j--;
        }
        
        return list;
    }
}