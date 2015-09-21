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
        ListNode leftnode=new ListNode(0);
        ListNode rightnode=new ListNode(0);
        ListNode left=leftnode;
        ListNode right=rightnode;
        while(head!=null){
            if(head.val<x){
                left.next=head;
                left=head;
            }
            else{
                right.next=head;
                right=head;
            }
            head=head.next;
        }
       right.next=null;//why need this?
        left.next=rightnode.next;
        return leftnode.next;
    }
}
