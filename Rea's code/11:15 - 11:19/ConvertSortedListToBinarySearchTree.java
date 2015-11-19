import java.util.*;
/*
class ListNode {
		int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	  }
	  
*/
public class ConvertSortedListToBinarySearchTree {
	static ListNode h;
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null){
            return null;
        }
        h = head;
        int length = 0; 
        length = getLength (head);
        return sortedListToBST (0, length -1);
    }
    public int getLength (ListNode head){
        int len = 0;
        ListNode p = head;
        while (p != null){
            len ++;
            p = p.next;
        }
        return len;
    }
    public TreeNode sortedListToBST (int start, int end){
        if (start > end){
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode left = sortedListToBST (start, mid -1);
        TreeNode root = new TreeNode(h.val);
        root.left = left;
        h = h.next;
        TreeNode right = sortedListToBST (mid + 1, end);
        root.right = right;
        return root;
    }
}
