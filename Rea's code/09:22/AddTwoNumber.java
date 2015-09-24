

public class AddTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode list = new ListNode (0);
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode p = list;
        while (p1 != null || p2 != null){
            if (p1 != null){
                carry += p1.val;
                p1 = p1.next;
            }
            if (p2 != null){
                carry += p2.val;
                p2 = p2.next;
            }
            p.next = new ListNode (carry % 10);
            carry /= 10;
            p = p.next;
        }
        if (carry == 1){
            p.next = new ListNode (1);
        }
        return list.next;
    }

}
