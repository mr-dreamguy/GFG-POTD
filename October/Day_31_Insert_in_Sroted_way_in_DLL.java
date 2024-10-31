class Solution {
    public Node sortedInsert(Node head, int x) {
        Node node = new Node(x);
        
        if (head == null) return node;
        
        if (head.data >= x) {
            head.prev = node;
            node.next = head;
            
            return node;
        }
        
        Node temp = head;
        while (temp.next != null && temp.next.data < x) temp = temp.next;
        node.next = temp.next;
        if (temp.next != null) node.next.prev = node;
        temp.next = node;
        node.prev = temp;
        
        return head;
    }
}