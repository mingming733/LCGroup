
public class MaximumDepthofBinaryTree {
	
	public int maxDepth(TreeNode root) {
		
		if (root == null) return 0;
		if (root.left == null && root.right == null) return 1;
		if (root.left == null || root.right == null) 
			return root.left != null ? maxDepth(root.left) +1 : maxDepth(root.right) +1;
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
	
//	public int maxDepth(TreeNode root) {
//	    if(root == null)
//	        return 0;
//	    return Math.max(maxDepth(root.left),maxDepth(root.right)) +1;
//	}

}
