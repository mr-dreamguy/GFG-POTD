class Solution {
    public boolean isLengthEven(Node head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        
        return (count&1) == 0;
    }
}
