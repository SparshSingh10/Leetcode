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
public class Solution {
    ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!= null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    ListNode mergeSortedList(ListNode p1,ListNode p2){
        if(p1 == null || p2 == null){
            return(p1==null)?p2:p1;
        }
        ListNode ans=new ListNode(0);
        ListNode curr=ans;
        while(p1!=null && p2!= null){
            if(p1.val<p2.val){
                curr.next=p1;
                p1=p1.next;
            }
            else{
                curr.next=p2;
                p2=p2.next;
            }
            curr=curr.next;
        }
        if(p1!=null || p2!=null){
            curr.next=(p1!=null)?p1:p2;
        }
        return ans.next;
    }
  
  public ListNode sortList(ListNode head) {
      if(head==null || head.next==null)
          return head;
      ListNode mid=mid(head);
      ListNode newhead=mid.next;
      mid.next=null;
      ListNode left=sortList(head);
      ListNode right=sortList(newhead);
      return mergeSortedList(left,right);
  

}
}