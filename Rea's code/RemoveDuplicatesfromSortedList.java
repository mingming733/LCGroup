

public class RemoveDuplicatesfromSortedList {
	public ListNode deleteDuplicatefromList (ListNode head){
		if (head == null || head.next == null){
			return head;
		}
		ListNode prev = head;
		ListNode p = head.next;
		while (p != null){
			if (prev.val == p.val){
				prev.next = p.next;
				p = p.next;
			}
			
		}
		return head;
	}
}
