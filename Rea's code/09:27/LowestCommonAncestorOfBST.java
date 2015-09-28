/*class TreeNode {
	      public int val;
	      public TreeNode left, right;
	      public TreeNode(int val) {
	          this.val = val;
	          this.left = this.right = null;
	      }
	  }
*/
public class LowestCommonAncestorOfBST {
	public TreeNode lowestCommonAncestor (TreeNode root, TreeNode p, TreeNode q){
		TreeNode m = root;
		if (m.val > p.val && m.val < q.val){
			return m;
		}
		if (m.val > p.val && m.val > q.val){
			return lowestCommonAncestor (root.left, p, q);
		}
		if (m.val < p.val && m.val < q.val){
			return lowestCommonAncestor (root.right, p, q);
		}
		return root;
	}
		
}
