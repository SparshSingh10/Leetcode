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
    public ListNode swapPairs(ListNode head) {
        if(head==null)
            return null;
        int temp;
        ListNode node=head;
        ListNode temp2=null;
        while(node!=null){
            if(node.next==null)
            {
                break;
            }
            temp=node.next.val;
            node.next.val=node.val;
            node.val =temp;
            node=node.next.next;
        }
        return head;
    }
}