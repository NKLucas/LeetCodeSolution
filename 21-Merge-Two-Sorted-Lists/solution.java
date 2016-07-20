/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        ListNode head1 = l1;
        ListNode head2 = l2;
        while(head1 != null && head2 != null){
            if(head1.val <= head2.val){
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }
        if(head1 != null){
            current.next = head1;
        } else {
            current.next = head2;
        }
        return dummy.next;
    }
}