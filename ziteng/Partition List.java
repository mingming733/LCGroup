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
        if(head == null || head.next == null) return head;
        ListNode res = new ListNode(0);
        ListNode tail = new ListNode(0);
        ListNode p = res;
        ListNode q = tail;
        while(head != null) {
            if(head.val < x) {
                p.next = head;
                p = p.next;
                //p.next.next = null;
                head = head.next;
            } else {
                q.next = head;
                q = q.next;
                //q.next.next = null;
                head = head.next;
            }
        }
        q.next = null; 
        p.next = tail.next;
        return res.next;
        
    }
}