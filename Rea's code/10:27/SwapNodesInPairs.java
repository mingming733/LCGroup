class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class SwapNodesInPairs {

	public static ListNode swapNodes (ListNode head){
		ListNode dummy = new ListNode (0);
		dummy.next = head;
		head = dummy;
		while (head != null && head.next != null){
			ListNode p1 = head.next;
			ListNode p2 = head.next.next;
			p2 = head.next;
			p1.next = p2.next;
			p1 = p2.next;
			head = p1;
		}
		return dummy.next;
		
	}
}
