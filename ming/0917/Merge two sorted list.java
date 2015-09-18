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
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        ListNode dummy = new ListNode(0);
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode pre = dummy;
        while (head1 != null && head2 != null){
            if (head1.val <= head2.val){
                pre.next = head1;
                head1 = head1.next;
            }else{
                pre.next = head2;
                head2 = head2.next;
            }
            pre = pre.next;
        }
        if (head1 != null){
            pre.next = head1;
        }else if (head2 != null){
            pre.next = head2;
        }
        return dummy.next;
    }
}

//recursive solution
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
        helper(dummy, l1, l2);
        return dummy.next;
    }
    private void helper(ListNode pre, ListNode l1, ListNode l2){
        if (l1 == null){
            pre.next = l2;
            return;
        }
        if(l2 == null){
            pre.next = l1;
            return;
        }
        if (l1.val <= l2.val){
            pre.next = l1;
            helper(pre.next, l1.next, l2);
        }else{
            pre.next = l2;
            helper(pre.next, l1, l2.next);
        }
    }
}