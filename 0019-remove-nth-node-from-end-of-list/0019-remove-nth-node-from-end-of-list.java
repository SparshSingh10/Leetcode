/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // if(head==null ||head.next==null)

//             return head;
        ListNode curr=head;
        int count=0;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
        if(count==1)
            return null;
         else if(count==n)   
        return head.next;
        // temp=head
        ListNode node=head;
        int target=count-n;
        while(target-->1){
            node=node.next;
            // target--;
        }
        if(node.next.next==null)
            node.next=null;
        else
            node.next=node.next.next;
        return head;
    }
    
}