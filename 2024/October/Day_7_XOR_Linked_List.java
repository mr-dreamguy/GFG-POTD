class Solution {
    // function should insert the data to the front of the list
    static Node insert(Node head, int data) {
        Node node = new Node(data);
        node.npx = head;
        
        return node;
    }

    // function to print the linked list
    static ArrayList<Integer> getList(Node head) {
        ArrayList<Integer> list = new ArrayList<>();
        
        while (head != null) {
            list.add(head.data);
            head = head.npx;
        }
        
        return list;
    }
}