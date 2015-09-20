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
       ListNode node=head;
       for(int i=0;i<n;i++){
           if(head== null){
               return null;
           }
           head=head.next;
       }
       while(head!=null){
           head=head.next;
           node=node.next;
       }
      
       return node;
    }
}

