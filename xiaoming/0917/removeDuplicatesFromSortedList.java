
public class removeDuplicatesFromSortedList {
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(20);
		l1.next = new ListNode(60);
		l1.next.next = new ListNode(60);
		
		ListNode l2 = removeList(l1);
		
		while (l2 != null) {
			System.out.println(l2.val+ "  ");
			l2 = l2.next;
		}
	}
	
	public static ListNode removeList(ListNode head) {
		
	    if(head == null)  return null;
	    if(head.next == null) return head;
	    
	    ListNode helper = new ListNode(0);
	    helper.next = head;
	    ListNode cur = head.next;
	    while(cur !=null )
	    {
	        if(head.val == cur.val) {
	        	head.next = cur.next;	
	        }
	        head = head.next;
	        cur = cur.next;
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

