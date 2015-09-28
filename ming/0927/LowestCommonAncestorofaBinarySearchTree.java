
public class LowestCommonAncestorofaBinarySearchTree {
	
	
	public TreeNode lowestCommonAncestorBST(TreeNode root, TreeNode p, TreeNode q) {
		if (root==null || p == null || q == null) return null;
		if (root.val == p.val || root.val == q.val) return root;
		if (root.val > p.val && root.val > q.val)
			return lowestCommonAncestorBST(root.left, p, q);
		if (root.val < p.val && root.val< q.val)
			return lowestCommonAncestorBST(root.right, p, q);
		return root;		
    }
	
	public TreeNode lowestCommonAncestorBT(TreeNode root, TreeNode p, TreeNode q) {
		if (root==null || p == null || q == null) return null;
		if (root == p || root == q) return root;
		
		TreeNode lRes = lowestCommonAncestorBT(root.left, p, q);
		TreeNode rRes = lowestCommonAncestorBT(root.right, p, q);
		
		if (lRes == null) return rRes;
		if (rRes == null) return lRes;
		
		return root;
    }

}
