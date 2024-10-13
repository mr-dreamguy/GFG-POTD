class Solution {
    public void deleteAlt(Node head) {
        while (head != null) {
            if (head.next != null) {
                head.next = head.next.next;
            }
            head = head.next;
        }
    }
}