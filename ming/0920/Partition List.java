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
        ListNode leftDummy = new ListNode(0);
        ListNode rightDummy =  new ListNode(0);
        ListNode left = leftDummy;
        ListNode right = rightDummy;
        while (head != null){
            if (head.val < x){
                left.next = head;
                left = left.next;
            }else{
                right.next = head;
                right = right.next;
            }
            head = head.next;
        }
        right.next = null;
        left.next = rightDummy.next;
        return leftDummy.next;
    }
}