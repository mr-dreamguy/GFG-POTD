class Solution {
    static Node construct(int arr[][]) {
        Node head = new Node(arr[0][0]);

        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.right = new Node(arr[0][i]);
            temp = temp.right;
        }
        
        Node start = head;
        for (int i = 1; i < arr.length; i++) {
            start.down = new Node(arr[i][0]);
            
            Node old = start.right;
            Node next = start.down;
            for (int j = 1; j < arr.length; j++) {
                next.right = new Node(arr[i][j]);
                next = next.right;
                old.down = next;
                old = old.right;
            }
            
            start = start.down;
        }
        
        return head;
    }
}