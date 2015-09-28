/*class TreeNode {
	      public int val;
	      public TreeNode left, right;
	      public TreeNode(int val) {
	          this.val = val;
	          this.left = this.right = null;
	      }
	  }
*/
public class PathSum {
	public boolean pathSum (TreeNode root, int sum){
		if (root == null){
			return false;
		}
		if ((root.val == sum) && (root.left == null) && (root.right == null) ){
			return true;
		}
		else {
			return pathSum (root.left, sum - root.val) || pathSum (root.right, sum - root.val);
		}
	}
}	
