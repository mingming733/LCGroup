
public class reverseLinkedList {
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(20);
		l1.next = new ListNode(60);
		
		ListNode l2 = reverseList(l1);
		
		System.out.println(l2.val+ "  "+l2.next.val+ "  ");
	}
	
	public static ListNode reverseList(ListNode head) {
		
	    if(head == null)  return null;
	    if(head.next == null) return head;
	    
	    ListNode helper = new ListNode(0);
	    helper.next = head;
	    ListNode pre = helper;
	    ListNode cur = head.next;
	    while(cur!=null)
	    {
	        ListNode next = cur.next;
	        cur.next = pre.next;
	        pre.next = cur;
	        head.next = next;
	        cur = next;
	    }
	    return helper.next;
	}
}

//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() { 
//    	val = 0;
//    	next = null;
//    }
//    ListNode(int x) { 
//    	val = x;
//    	next = null;
//    }
// }

