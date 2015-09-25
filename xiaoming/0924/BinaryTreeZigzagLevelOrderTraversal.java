import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {
	public static void main(String[] args) {
		
		
	}
	
	public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
	    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	    if(root == null)
	        return result;
	    
	    //
	    LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
	    queue.add(root);
	    int curNum = 0;
	    int lastNum = 1;
	    int level = 0;
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    
	    //
	    while(!queue.isEmpty())
	    {
	        TreeNode cur = queue.poll();
	        lastNum--;
	        list.add(cur.val);
	        if(cur.left!=null)
	        {
	            queue.add(cur.left);
	            curNum ++;
	        }
	        if(cur.right!=null)
	        {
	            queue.add(cur.right);
	            curNum++;
	        }
	        if(lastNum==0)
	        {
	            lastNum = curNum;
	            curNum = 0;
	            if (level % 2 == 1) Collections.reverse(list);
	            result.add(list);
	            list = new ArrayList<Integer>();
	            level++;
	        }
	    }
	    return result;
	}

}
