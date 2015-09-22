/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(0);
        ListNode curr = newHead;
        int carryOn = 0;
        while (l1 != null && l2 != null){
            int sum = l1.val + l2.val + carryOn;
            curr.next = new ListNode(sum % 10);
            carryOn = sum / 10;
            curr = curr.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null){
            curr.next = new ListNode((l1.val + carryOn) % 10);
            carryOn = (l1.val + carryOn) / 10;
            curr = curr.next;
            l1 = l1.next;
        }
        while (l2 != null){
            curr.next = new ListNode((l2.val + carryOn) % 10);
            carryOn = (l2.val + carryOn) / 10;
            curr = curr.next;
            l2 = l2.next;
        }
        if (carryOn == 1){
            curr.next = new ListNode(1);
        }
        return newHead.next;
    }
}