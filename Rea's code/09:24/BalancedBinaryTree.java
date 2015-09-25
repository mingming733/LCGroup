class TreeNode {
	      public int val;
	      public TreeNode left, right;
	      public TreeNode(int val) {
	          this.val = val;
	          this.left = this.right = null;
	      }
	  }
public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }
        int val = getBalance (root);
        if (val == -1){
            return false;
        }
        else {
            return true;
        }
    }
        public int getBalance (TreeNode root){
            if (root == null){
                return 0;
            }
            int left = getBalance (root. left);
            int right = getBalance (root. right);
            if (left == -1 || right == -1){
                return -1;
            }
            if (Math.abs (left - right) > 1){
                return -1;
            }
            return Math.max (left, right) + 1;
    }
}
