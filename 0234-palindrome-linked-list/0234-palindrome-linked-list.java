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
    public boolean isPalindrome(ListNode head) {
        // mid nikalo
       ListNode mid= middleNode(head);
        // mid se aur uske aage ka reverse karo
        ListNode headSecond=reverseList(mid);
        // backup
        // ListNode reversehead=headSecond;
            // compare both the halfs
        while(headSecond!=null){
            if(head.val!=headSecond.val)
                return false;
        head=head.next;
        headSecond=headSecond.next;
        }
        return true;
    }
    
    
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
     public ListNode reverseList(ListNode head) {
         if(head==null)
             return head;
         ListNode pres=head;
         ListNode prev=null;
         ListNode next=pres.next;
        
      

       while(pres!=null){
       pres.next=prev;
           prev=pres;
               pres=next;
           if(next!=null)
               next=next.next;
       }

       return prev;
    }
        
}