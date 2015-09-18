class ListNode {
	int val;
	ListNode next;
	ListNode(int x){ val = x;}
}

public class RemoveDuplicatesfromSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
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
