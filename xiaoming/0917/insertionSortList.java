
public class insertionSortList {
	
	public static void main(String[] args) {
		
		ListNode helper = new ListNode();
		ListNode l1 = new ListNode(20);
		helper.next = l1;
		l1.next = new ListNode(6);
		l1 = l1.next;	
		l1.next = new ListNode(8);
		l1 = l1.next;
		l1.next = new ListNode(2);
		l1 = l1.next;
		l1.next = new ListNode(9);
		l1 = l1.next;
		l1.next = new ListNode(15);
		l1 = l1.next;
		l1.next = new ListNode(60);
		
		ListNode l2 = insertionSortListt(helper.next);
		
		while (l2 != null) {
			System.out.println(l2.val+ "  \n");
			l2 = l2.next;	
		}
		
	}
		
	public static ListNode insertionSortListt(ListNode head) {
		if (head == null)  return null;
		ListNode helper = new ListNode();
		//helper.next = head;
		ListNode pre = helper;
		ListNode cur = head;
		while (cur != null) {
			
			ListNode next = cur.next;
			pre = helper;
			while(pre.next != null && pre.next.val <= cur.val) {
				pre = pre.next;
			}
			cur.next = pre.next;
			pre.next = cur;			
			cur = next;
		}
		return helper.next;
	}
}
	
	
	
	class ListNode {
  int val;
  ListNode next;
  ListNode() { 
  	val = 0;
  	next = null;
  }
  ListNode(int x) { 
  	val = x;
  	next = null;
  }
}
