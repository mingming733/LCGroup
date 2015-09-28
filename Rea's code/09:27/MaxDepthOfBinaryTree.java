/*class TreeNode {
	      public int val;
	      public TreeNode left, right;
	      public TreeNode(int val) {
	          this.val = val;
	          this.left = this.right = null;
	      }
	  }
*/
public class MaxDepthOfBinaryTree {
	public int maxDepth (TreeNode root) {
		if (root == null){
			return 0;
		}
		int leftMax = maxDepth (root.left);
		int rightMax = maxDepth (root.right);
		return Math.max(leftMax, rightMax ) + 1;
	}
}
