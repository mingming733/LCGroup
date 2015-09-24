
public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
	    
        if(p == null && q == null){
            return true;
        }else if(p != null && q != null){
            if(p.val == q.val){
                return isSameTree(p.left, q.left) && isSameTree(q.right, p.right);
            }
        }else{
            return false;
        }
 
        return false;
    }
}
