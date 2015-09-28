import java.util.*;
/*class TreeNode {
	      public int val;
	      public TreeNode left, right;
	      public TreeNode(int val) {
	          this.val = val;
	          this.left = this.right = null;
	      }
	  }
*/
public class BinaryTreePath {
	List<String> res = new ArrayList <String> ();
	public List <String> binaryTreePath (TreeNode root){
		if (root != null)
			findPath (root, String.valueOf(root.val));
		return res;
	}
	public void findPath (TreeNode n, String path){
		if (n.left == null && n.right == null)
			res.add (path);
		if (n.left != null)
			findPath (n.left, path + "->" + n.left.val);
		if (n.right != null)
			findPath (n.right, path + "->" + n.right.val);
	}
}
