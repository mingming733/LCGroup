
import java.util.*;
class TreeNode {
	      public int val;
	      public TreeNode left, right;
	      public TreeNode(int val) {
	          this.val = val;
	          this.left = this.right = null;
	      }
	  }
public class BinaryTreeLevelOrderTraversalII {
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // write your code here
        //BFS
        ArrayList <ArrayList <Integer>> ans = new ArrayList <ArrayList <Integer>>();
        if (root == null){
            return ans;
        }
        Queue <TreeNode> q = new LinkedList <TreeNode>();
        q.add (root);
        while (! q. isEmpty()){
            ans.add (new ArrayList <Integer>());
            int currSize = q.size();
            for (int i = 0; i < currSize; i ++){
                TreeNode node = q. remove();
                ans.get(ans.size() - 1).add(node.val);
                if (node.left != null) 
                    q.add(node.left);
                if (node.right != null) 
                    q.add(node.right);
        }
    }
    return ans;
            }
}
