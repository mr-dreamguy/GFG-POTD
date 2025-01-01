class Solution {
    public List<Integer> rearrange(List<Integer> arr) {
        int n = arr.size();
        
        for (int i = 0; i < n; i++) {
            int curr = arr.get(i);
            
            while (curr != i) {
                if (curr == -1 || curr >= n) break;
                
                int temp = arr.get(curr);
                if (temp == curr) break;

                arr.set(i, temp);
                arr.set(curr, curr);
                curr = temp;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (arr.get(i) != i) arr.set(i, -1);
        }
        
        return arr;
    }
}