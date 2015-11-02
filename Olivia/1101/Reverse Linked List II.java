/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m>=n ||head==null){
            return head;
        }
        ListNode dummy =new ListNode(0);
        dummy.next=head;
        head=dummy;
        for(int i=1;i<m;i++){
            if(head==null){
                return null;
            }
            head=head.next;
        }
        ListNode preNode=head;
        ListNode mNode=head.next;
        ListNode nNode=mNode;
        ListNode postNode=mNode.next;
        for(int i=m;i<n;i++){
            if(postNode==null){
                return null;
            }
            ListNode tmp=postNode.next;
            postNode.next=nNode;
            nNode=postNode;
            postNode=tmp;
        }
        mNode.next=postNode;
        preNode.next=nNode;
        return dummy.next;
    }
}
