class Solution {
    public DLLNode sortAKSortedDLL(DLLNode head, int k) {
        // Code here
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        DLLNode head1=head;
        int size=0;
        while(head1!=null){
            head1=head1.next;
            size++;
        }
        int idx=0;
        head1=head;
        while(idx<=k){
            pq.add(head1.data);
            head1=head1.next;
            idx++;
        }
        DLLNode newHead=new DLLNode(pq.remove());
        DLLNode res=newHead;
        for(int i=k+1;i<size;i++){
            pq.add(head1.data);
            DLLNode newNode=new DLLNode(pq.remove());
            newHead.next=newNode;
            newNode.prev=newHead;
            newHead=newHead.next;
            head1=head1.next;
        }
        while(!pq.isEmpty()){
            DLLNode newNode=new DLLNode(pq.remove());
            newHead.next=newNode;
            newNode.prev=newHead;
            newHead=newHead.next;
        }
        return res;
    }
}