class Solution {
    // Function to reverse a circular linked list
    Node reverse(Node head) {
        if (head == null || head.next == head) return head;
        Node curr = head;
        Node prev = null;
        Node next = null;
        
        while (curr.next != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        curr.next = prev;
        return prev;
    }

    // Function to delete a node from the circular linked list
    Node deleteNode(Node head, int key) {
        if (head == null) return head;
        
        Node prev = head;
        while (prev.next != head) prev = prev.next;
        
        if (head.data == key) {
            prev.next = head.next;
            head = head.next;
            
            return head;
        }

        Node curr = head.next;
        prev = head;
        while (curr.next != head) {
            if (curr.data == key) {
                prev.next = curr.next;
                break;
            }
            
            prev = curr;
            curr = curr.next;
        }
        
        return head;
    }
}