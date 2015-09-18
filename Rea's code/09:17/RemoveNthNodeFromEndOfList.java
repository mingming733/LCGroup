
public class RemoveNthNodeFromEndOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode removeNthNodeFromEndOfList (ListNode head, int n){
		if (head == null){
			return null;
		}
		int count = 0;
		ListNode p = head;
		while (p != null){
			count ++;
			p = p.next;
		}
		int fromStart = count + 1 - n;
		if (fromStart == 1){
			return head.next;
		}
		int i = 0;
		ListNode cur = head;
		while (cur != null){
			i ++;
			if (i == count - n){
				cur.next = cur.next.next;
			}
			else {
				cur = cur.next;
			}
		}
		return head;
	}
}
