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
    public void reorderList(ListNode head) {
        if(head==null ||head.next==null)
            return;
        
        ListNode mid=middleNode(head);
        ListNode SecondHead=reverseList(mid);
        ListNode FirstHead=head;
        
        while(FirstHead!=null && SecondHead!=null){
                ListNode temp=FirstHead.next;
                FirstHead.next=SecondHead;
                FirstHead=temp;
            
                temp=SecondHead.next;
                SecondHead.next=FirstHead;
                SecondHead=temp;
            
            
        }
        if(FirstHead!=null)
            FirstHead.next=null;
        
        
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