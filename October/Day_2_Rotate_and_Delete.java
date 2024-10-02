class Solution {
    public static int rotateDelete(ArrayList<Integer> arr) {
        int n = arr.size();
        int operations = n/2;
        int k = 0;
        
        while (k < operations) {
            Collections.rotate(arr, 1);
            arr.remove(n-k-1);
            n--;
            k++;
        }
        
        return arr.get(0);
    }
}