
public class mergeTwoSortedLists {
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(20);
		l1.next = new ListNode(60);
		ListNode l2 = new ListNode(3);
		ListNode l3 = mergeTwoLists(l1, l2);
		
		System.out.println(l3.val+ "  "+l3.next.val+ "  "+l3.next.next.val);
	}
	
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	    ListNode helper = new ListNode(0);
	    ListNode pre = helper;
	    helper.next = l1;
	    while(l1!=null && l2 != null)
	    {
	        if(l1.val>l2.val)
	        {
	            ListNode next = l2.next;
	            l2.next = pre.next;
	            pre.next = l2;
	            l2 = next;
	        }
	        else
	        {
	            l1 = l1.next;
	        }
	        pre = pre.next;

	    }
	    if(l2!=null)
	    {
	        pre.next = l2;
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

