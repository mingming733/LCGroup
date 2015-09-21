
public class addTwoNumbers {
	
	public static void main(String[] args) {
		
		ListNode helper = new ListNode();
		ListNode l1 = new ListNode(2);
		helper.next = l1;
		l1.next = new ListNode(6);
		l1 = l1.next;	
		l1.next = new ListNode(8);
		l1 = l1.next;
		l1.next = new ListNode(2);
		l1 = l1.next;
		l1.next = new ListNode(9);
		l1 = l1.next;
		l1.next = new ListNode(5);
		l1 = l1.next;
		l1.next = new ListNode(6);
		
		ListNode l2 = addTwoNumber(helper.next, helper.next);
		
		while (l2 != null) {
			System.out.println(l2.val+ "  \n");
			l2 = l2.next;	
		}
		
	}
	
	
	
	
	
	
	public static ListNode addTwoNumber(ListNode l1, ListNode l2) {
	    int carry = 0;
	    int digit = 0;
	    ListNode head = null;
	    ListNode pre = null;
	    
	    while(l1!=null && l2!=null)
	    {
	        digit = (l1.val+l2.val+carry)%10;
	        carry = (l1.val+l2.val+carry)/10;
	        ListNode newNode = new ListNode(digit);
	        if(head==null)
	            head = newNode;
	        else
	            pre.next = newNode;
	        pre = newNode;
	        l1 = l1.next;
	        l2 = l2.next;
	    }
	    
	    while(l1!=null)
	    {
	        digit = (l1.val+carry)%10;
	        carry = (l1.val+carry)/10;
	        ListNode newNode = new ListNode(digit);
	        if(head==null)
	            head = newNode;
	        else
	            pre.next = newNode;
	        pre = newNode;
	        l1 = l1.next;            
	    }
	    
	    while(l2!=null)
	    {
	        digit = (l2.val+carry)%10;
	        carry = (l2.val+carry)/10;
	        ListNode newNode = new ListNode(digit);
	        if(head==null)
	            head = newNode;
	        else
	            pre.next = newNode;
	        pre = newNode;
	        l2 = l2.next;            
	    }  
	    
	    
	    if(carry>0)
	    {
	        ListNode newNode = new ListNode(carry);
	        pre.next = newNode;
	    }
	    
	    
	    return head;
	}

}
