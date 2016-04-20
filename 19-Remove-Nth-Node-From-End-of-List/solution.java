/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode fast = head;
        ListNode slow = dummy;
        
        while (n > 1){
            fast = fast.next;
            n -= 1;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        
    }
}