class Solution {
    // Function to append a new node with newData at the end of a linked list
    Node[] alternatingSplitList(Node head) {
        Node list1 = null;
        Node list2 = null;
        boolean flag = true;
        Node[] ans = new Node[2];
        
        while (head != null) {
            if (flag) {
                if (list1 == null) {
                    list1 = new Node(head.data);
                    ans[0] = list1;
                } else {
                    list1.next = new Node(head.data);
                    list1 = list1.next;
                }
            } else {
                if (list2 == null) {
                    list2 = new Node(head.data);
                    ans[1] = list2;
                } else {
                    list2.next = new Node(head.data);
                    list2 = list2.next;
                }
            }
            
            head = head.next;
            flag = !flag;
        }
        
        return ans;
    }
}
