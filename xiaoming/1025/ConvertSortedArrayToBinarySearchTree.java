import java.util.LinkedList;
import java.util.List;


public class ConvertSortedArrayToBinarySearchTree {
	
	public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        int length = nums.length;
        TreeNode root = new TreeNode(nums[(length-1) / 2]);
        helper(root, nums, 0, length - 1);
        return root;
        
        
       
        
    }
    public void helper(TreeNode root, int[] nums, int start, int end) {
        if (root == null) return;
        if (nums == null || nums.length == 0 || start > end) return;
        if (start < ((start + end)/2 + start)/2) {
            root.left = new TreeNode(((start + end)/2 + start)/2);
            helper(root.left, nums, start, (start + end)/2);
        }
        if (end > ((start + end)/2 + end)/2) {
            root.right = new TreeNode(((start + end)/2 + end)/2);
            helper(root.right, nums, (start + end)/2, end);
        }
    }
    
    
//    public TreeNode sortedArrayToBST(int[] nums) {
//        if (nums == null || nums.length == 0) return null;
//        return sortedArrayToBST( nums, 0, nums.length - 1);
//    }
//    public TreeNode sortedArrayToBST(int[] nums, int start, int end) {
//		  if (start > end) return null;
//		  int mid = start + (end - start) / 2;
//		  TreeNode node = new TreeNode(nums[mid]);
//		  node.left = sortedArrayToBST(nums, start, mid-1);
//		  node.right = sortedArrayToBST(nums, mid+1, end);
//		  return node;
//	}

}

 class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }