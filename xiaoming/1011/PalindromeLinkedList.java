
public class PalindromeLinkedList {
	
	public boolean isPalindrome(ListNode head) {
        
        if(head == null || head.next == null)
            return true;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode secondHead = slow.next;
        slow.next = null;
        ListNode next = secondHead.next;
        secondHead.next = null;
     
        while(next != null){
            ListNode temp = next.next;
            next.next = secondHead;
            secondHead = next;
            next = temp;
        }
    
        while(head != null){
            if(head.val != secondHead.val)
                return false;
            head = head.next;
            secondHead = secondHead.next;
        }
        return true;
    }

}
