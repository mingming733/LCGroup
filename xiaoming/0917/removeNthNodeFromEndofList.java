
public class removeNthNodeFromEndofList {
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(20);
		l1.next = new ListNode(60);
		l1.next.next = new ListNode(60);
		
		ListNode l2 = removeNthFromEnd(l1, 1);
		
		while (l2 != null) {
			System.out.println(l2.val+ "  ");
			l2 = l2.next;
		}
	}
	
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
	    if(head == null)
	        return null;
	    int i=0;
	    ListNode runner = head;
	    while(runner!=null && i<n)
	    {
	        runner = runner.next;
	        i++;
	    }
	    if(i<n)
	        return head;
	    if(runner == null)
	        return head.next;
	    ListNode walker = head;
	    while(runner.next!=null)
	    {
	        walker = walker.next;
	        runner = runner.next;
	    }
	    walker.next = walker.next.next;
	    return head;
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

