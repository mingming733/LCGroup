import java.util.*;
class TreeNode {
    public int val;
    public TreeNode left, right;
    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
public class BinaryTreeZigzagLevelOrderTraversal {
	public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        // write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (root == null) {
			return result;
		}
		
		Stack<TreeNode> currLevel = new Stack<TreeNode>();
		Stack<TreeNode> nextLevel = new Stack<TreeNode>();
		currLevel.push(root);
		boolean normalOrder = true;
		
		while (!currLevel.isEmpty()) {
			ArrayList<Integer> level = new ArrayList<Integer>();
			
			while (!currLevel.isEmpty()) {
				TreeNode current = currLevel.pop();
				level.add(current.val);
				
				if (normalOrder) {
					if (current.left != null) {
						nextLevel.push(current.left);
					}

					if (current.right!= null) {
						nextLevel.push(current.right);
					}
				} else {
					if (current.right!= null) {
						nextLevel.push(current.right);
					}

					if (current.left != null) {
						nextLevel.push(current.left);
					}
				}
			}
			result.add(level);
			// Notice we need to give nextLevel a new space to prevent error from pointing to same space with currLevel
			currLevel = nextLevel;
			nextLevel = new Stack<TreeNode>();
			normalOrder = !normalOrder;
		}
		
		return result;
	
    }
}
