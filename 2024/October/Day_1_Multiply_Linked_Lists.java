class Solution {
    long mod = (long)(1e9+7);
    
    public long multiplyTwoLists(Node first, Node second) {
        long val1 = getVal(first);
        long val2 = getVal(second);
        
        return (val1 * val2)%mod;
    }
    
    private long getVal(Node head) {
        long val = 0;
        
        while (head != null) {
            val = (val * 10)%mod;
            val = (val%mod + head.data%mod)%mod;
            head = head.next;
        }
        
        return val%mod;
    }
}