


public class partitionList {
	
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
		
		ListNode l2 = partition(helper.next, 20);
		
		while (l2 != null) {
			System.out.println(l2.val+ "  \n");
			l2 = l2.next;	
		}
		
	}

	
	public static ListNode partition(ListNode head, int x) {
	    if(head == null)   return null;
	    ListNode helper = new ListNode(0);
	    helper.next = head;
	    ListNode pre = helper;
	    ListNode runner = helper;
	    while(runner.next!=null)
	    {
	        if(runner.next.val<x)
	        {
	            if(pre!=runner)
	            {
	                ListNode next = runner.next.next;
	                runner.next.next = pre.next;
	                pre.next = runner.next;
	                runner.next = next;
	            }
	            else
	                runner = runner.next;
	            pre = pre.next;
	        }
	        else
	        {
	            runner = runner.next;
	        }
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

