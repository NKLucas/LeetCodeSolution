/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        // we can use merge sort to do this problem. 
        if (head == null || head.next == null){
            return head;
        }
        ListNode mid = getMid(head);
        ListNode afterMid = mid.next;
        mid.next = null;
        
        ListNode left = sortList(head);
        ListNode right = sortList(afterMid);
        ListNode new_head = merge(left, right);
        return new_head;
    }
    
    private ListNode getMid(ListNode head){
        if(head.next.next == null){
            return head;
        }
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    private ListNode merge(ListNode left, ListNode right){
        if (left == null){
            return right;
        }
        if (right == null){
            return left;
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (left != null && right != null){
            if(left.val < right.val){
                curr.next = left;
                left = left.next;
            } else {
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }
        if (left == null){
            curr.next = right;
        }
        if (right == null){
            curr.next = left;
        }
        return dummy.next;
    }
    
}