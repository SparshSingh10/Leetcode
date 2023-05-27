class Solution {
    public ListNode middleNode(ListNode head) {
       ListNode fast=head;
       ListNode slow=head;
       //  ListNode node=head;
       // int size=0;
       //  while(node!=null){
       //      size++;
       //      node=node.next;
       //  }
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
         
        }
        // if(size%2!=0)
        return slow;
        // else
        //     return slow.next;
    }
}