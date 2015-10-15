import java.util.*;

public class BinaryTreeInorderTraversal {
	
	public List<Integer> inorderTraversal(TreeNode root) {
        
        return helper(root);
    }
    
    public List<Integer> helper(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) return res;
        if (root.left != null) res.addAll(helper(root.left));
        else {
            res.add(root.val);
            if (root.right != null) res.addAll(helper(root.right));
        }
        return res;
    }
	
	
//	public List<Integer> inorderTraversal(TreeNode root) {
//		List<Integer> res = new ArrayList<Integer>();
//		Stack<TreeNode> stack = new Stack<TreeNode>();
//		if (root == null) return res;
//		while (!stack.isEmpty() || root != null) {
//			if (root != null) {
//				stack.push(root);
//				root = root.left;
//			}
//			else {
//				root = stack.pop();
//				res.add(root.val);
//				root = root.right;
//			}
//		}
//		
//		return res;
//	}
}





class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int val) {
		this.val = val;
		left = null;
		right = null;
	}	
}