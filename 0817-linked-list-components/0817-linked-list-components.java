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
    
    public static boolean find(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(target == arr[i]){

                return true;
            }
        }

        return false;
    } 
    public int numComponents(ListNode head, int[] nums) {
        int connected = 0;
        int found = 0;
		

        while(head != null){
            if(find(nums, head.val)){
	
                found++;
		
                if(found == 1){
                    connected++;
                }
            }
	
            else{
                found=0;
            }
            head = head.next;
        }
		
        return connected;
    }
}