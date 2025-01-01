// Approach 1

class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        int m = 0;
        for (Node temp = head; temp != null; temp = temp.next) m++;
        
        Node temp = head;
        for (int i = 0; i < m-n; i++) {
            temp = temp.next;
        }
        
        int sum = 0;
        for (; temp != null; temp = temp.next) sum += temp.data;
        
        return sum;
    }
}

// Approach 2

class Solution {
    
    private Node reverse(Node head) {
        Node curr, next, prev;
        curr = head;
        next = head.next;
        prev = null;
        
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = next;
        }
        
        return prev;
    }

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        // write code here
        head = reverse(head);
        Node temp = head;
        int sum = 0;
        
        while (n-- > 0) {
            sum += temp.data;
            temp = temp.next;
        }
        
        reverse(head);
        return sum;
    }
}

// Approach 3

class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        Node temp = head;
        int sum = 0;
        while (n-- > 0) {
            sum += temp.data;
            temp = temp.next;
        }
        
        int sum2 = 0;
        while (temp != null) {
            sum += temp.data;
            sum2 += head.data;
            temp = temp.next;
            head = head.next;
        }
        
        return sum-sum2;
    }
}