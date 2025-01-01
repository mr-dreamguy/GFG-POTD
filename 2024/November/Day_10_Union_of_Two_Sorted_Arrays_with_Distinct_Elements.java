class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        if (a.length > b.length) return findUnion(b, a);
        
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                list.add(a[i++]);
            } else if (b[j] < a[i]) {
                list.add(b[j++]);
            } else {
                list.add(a[i++]);
                j++;
            }
        }
        
        while (i < a.length) list.add(a[i++]);
        while (j < b.length) list.add(b[j++]);
        
        return list;
    }
}