/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        while (head != null && head.next != null){
            ListNode bigger = dummy;
            ListNode curr = head.next;
            while (bigger.next != curr && bigger.next.val <= curr.val){
                bigger = bigger.next;
            }
            if (bigger.next != curr){
                head.next = curr.next;
                curr.next = bigger.next;
                bigger.next = curr; 
            }else{
                head = head.next;
            }
            
        }
        return dummy.next;
    }
}