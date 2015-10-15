import java.util.*;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode (int x ){val = x;}
	
}
public class BinaryTreeInorderTraversal {
	public List<Integer> inorderTraversal (TreeNode root){
		ArrayList<Integer>result = new ArrayList <Integer>();
		if (root == null){
			return result;
		}
		traverse (root, result);
		return result;
	}
	private void traverse (TreeNode root, ArrayList<Integer> result){
		if (root == null){
			return;
		}
		traverse (root.left, result);
		result.add (root.val);
		traverse (root.right, result);
	}
}
