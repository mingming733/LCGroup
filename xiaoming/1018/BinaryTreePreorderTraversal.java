import java.util.*;


public class BinaryTreePreorderTraversal {

	public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) return res;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (root != null || !stack.isEmpty()) {
            res.add(root.val);
            if (root.right != null) stack.push(root.right);
            if (root.left != null) stack.push(root.left);
            if (!stack.isEmpty()) root = stack.pop();
        }
        return res;
        
    }
}


class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }