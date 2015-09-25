
public class BalancedBinaryTree {

	public boolean isBalanced(TreeNode root)
	{
	    return height(root)>=0;
	}
	private int height(TreeNode root)
	{
	    if(root == null)
	        return 0;
	    int left = height(root.left);
	    int right = height(root.right);
	    if(left<0 || right<0)
	        return -1;
	    if(Math.abs(left-right) >= 2 )
	        return -1;
	    return Math.max(left,right) + 1;
	}
}
