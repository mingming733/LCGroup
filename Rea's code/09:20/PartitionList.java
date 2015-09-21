class ListNode {
	int val;
	ListNode next;
	ListNode (int x) {val = x; }
}
public class PartitionList {
	public 	ListNode partition (ListNode head, int x){
		if (head == null || head.next == null){
			return head;
		}
		ListNode smallNumber = new ListNode (-1);
		ListNode smallHead = smallNumber;
		ListNode bigNumber = new ListNode (-1);
		ListNode bigHead = bigNumber;
		while (head != null){
			if (head.val < x){
				smallNumber.next = head;
				smallNumber = smallNumber.next;
			}
			else {
				bigNumber.next = head;
				bigNumber = bigNumber.next;
			}
			head = head.next;
		}
		bigNumber.next = null;
		smallNumber.next = bigHead.next;
		return smallHead.next;
		
		
	}

}
