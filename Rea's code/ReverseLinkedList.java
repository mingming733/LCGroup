
public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
		public ListNode reverseList (ListNode head){
			ListNode prev = null;
			while (head != null){
				ListNode temp = head.next;
				head.next = prev;
				prev = head;
				head = temp;
			}
			return prev;
		}
}
