/*class TreeNode {
	      public int val;
	      public TreeNode left, right;
	      public TreeNode(int val) {
	          this.val = val;
	          this.left = this.right = null;
	      }
	  }
*/
public class InvertTree {
	public TreeNode invertTree (TreeNode root){
		if (root != null){
			invert (root);
		}
		return root;
	}
	public void invert (TreeNode p){
		TreeNode temp = p.left;
		p.left = p.right;
		p.right = temp;
		if (p.left != null){
			invert (p.left);
		}
		if (p.right != null){
			invert (p.right);
		}
		
	}
}
