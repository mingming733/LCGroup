
public class InsertionSortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode insertionSortedList (ListNode head){
		ListNode list = new ListNode (0);
		while (head != null){
			ListNode p = list;
			while (p.next != null && p.next.val < head.val){
				p = p.next;
			}
			ListNode temp = head.next;
			head.next = p.next;
			p.next = head;
			head = temp;
		}
		return list.next;
	}
}
