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
    public ListNode insertionSortList(ListNode head) {
          if(head==null || head.next==null)
          return head;
      
      ListNode mid=mid(head);
      // first part
      ListNode newhead=mid.next;
      // second part
      mid.next=null;
      ListNode left=insertionSortList(head);
   
      ListNode right=insertionSortList(newhead);
      
      return mergeSortedList(left,right);
    }
    
     ListNode mid(ListNode head){
        // returns mid
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!= null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
     ListNode mergeSortedList(ListNode p1,ListNode p2){
        // if ony one given for sort
        if(p1 == null || p2 == null){
            return(p1==null)?p2:p1;
        }
        
        // empty linklist node to store
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
  
}