/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        int length = getLength(head);
        k = k % length;
        
        if (k == 0){
            return head;
        }
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(k > 0){
            fast = fast.next;
            k -= 1;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        ListNode newHead = slow.next;
        slow.next = null;
        fast.next = head;
        return newHead;
        
    }
    
    private int getLength(ListNode head){
        int length = 0;
        while(head != null){
            length += 1;
            head = head.next;
        }
        return length;
    }
    
    
}