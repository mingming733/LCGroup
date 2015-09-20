/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       if(n<=0){
           return null;
       } 
       ListNode r=new ListNode(0);
       r.next=head;
       ListNode first=r;
       for(int i=0;i<n;i++){
           if(head==null){
               return null;
           }
           head=head.next;
       }
       while(head!=null){
           head=head.next;
           first=first.next;
       }
       first.next=first.next.next;
       return r.next;
       
    }
}
