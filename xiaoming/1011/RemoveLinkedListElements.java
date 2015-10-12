
public class RemoveLinkedListElements {
	
	public ListNode removeElements(ListNode head, int val) {
        
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode pre = new ListNode(0);
        pre.next = head;
        while (head.next != null) {
            if(head.next.val == val)
               head.next = head.next.next;
            else head = head.next;
        }
        
        return pre.next;
    }
	

}


class ListNode {
	     int val;
	      ListNode next;
	     ListNode(int x) { val = x; }
	  }