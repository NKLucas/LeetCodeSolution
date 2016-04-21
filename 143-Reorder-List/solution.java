/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null){
            return;
        }
        ListNode mid = getMid(head);
        ListNode afterMid = mid.next;
        mid.next = null;
        ListNode revHead = reverseList(afterMid);
        
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        
        int count = 0;
        
        while(head != null && revHead != null){
            if (count % 2 == 0){
                curr.next = head;
                head = head.next;
            } else {
                curr.next = revHead;
                revHead = revHead.next;
            }
            curr = curr.next;
            count += 1;
        }
        if (revHead != null){
            curr.next = revHead;
        }
        if (head != null){
            curr.next = head;
        }
        
    }
    
    
    private ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    
    private ListNode getMid(ListNode head){
        if (head == null || head.next == null || head.next.next == null){
            return head;
        }
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}