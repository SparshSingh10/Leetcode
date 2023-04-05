class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode first = head;
        ListNode last = head;
        while(last!=null && last.next!=null) {
            
            first= first.next;
        last=last.next.next;
        }
        return first;
    }
}