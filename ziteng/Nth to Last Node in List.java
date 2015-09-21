/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class Solution {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: Nth to last node of a singly linked list. 
     */
    ListNode nthToLast(ListNode head, int n) {
        ListNode p = head;
        int len = 0;
        while(p!=null) {
            p = p.next;
            len++;
        }
        p = head;
        for(int i = 0; i < len - n; i++) {
            p = p.next;
        }
        return p;
    }
}

