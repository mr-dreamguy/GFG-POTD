class Intersect {
    // Function to find intersection point in Y shaped Linked Lists.
    int intersectPoint(Node head1, Node head2) {
        int length1, length2;
        length1 = length2 = 0;
        
        for (Node temp = head1; temp != null; temp = temp.next) length1++;
        for (Node temp = head2; temp != null; temp = temp.next) length2++;
        
        if (length1 > length2) return helper(head1, head2, length1-length2);
        return helper(head2, head1, length2-length1);
    }
    
    int helper(Node h1, Node h2, int diff) {
        for (int i = 0; i < diff; i++) {
            h1 = h1.next;
        }
        
        while (h1 != h2) {
            h1 = h1.next;
            h2 = h2.next;
        }
        
        if (h1 == null) return -1;
        return h1.data;
    }
    
}