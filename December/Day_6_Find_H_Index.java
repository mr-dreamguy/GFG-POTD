// User function Template for Java
class Solution {
    // Function to find hIndex
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int hcount = 0;
        
        while (hcount < n && citations[n-1-hcount] > hcount) hcount++;
        
        return hcount;
    }
}