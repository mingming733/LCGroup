
public class NthToLastNodeInList {
	public ListNode nthToLast (ListNode head, int n){
		if (head == null){
			return null;
		}
		ListNode p = head;
		int length = 0;
		while (p != null){
			length ++;
			p = p.next;
		}
		p = head;
		int i = 0;
		while (p != null){
			i ++;
			if (i != length + 1 - n){
				p = p.next;
			}
			else {
				return p;
			}
		}
		return p;
	}
}
