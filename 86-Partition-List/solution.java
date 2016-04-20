/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        
        ListNode smaller = new ListNode(0);
        
        // bigger means no smaller than the given x.
        ListNode bigger = new ListNode(0);
        
        ListNode sRunner = smaller;
        ListNode bRunner = bigger;
        
        while(head != null){
            if (head.val < x){
                sRunner.next = head;
                sRunner = sRunner.next;
            } else {
                bRunner.next = head;
                bRunner = bRunner.next;
            }
            head = head.next;
        }
        bRunner.next = null;
        sRunner.next = bigger.next;
        return smaller.next;
        
    }
}