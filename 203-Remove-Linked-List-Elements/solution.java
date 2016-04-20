/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode end = dummy;
        ListNode curr = head;
        
        while(curr != null){
            while (curr != null && curr.val == val){
                curr = curr.next;
            }
            end.next = curr;
            end = end.next;
            if (curr != null){
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}