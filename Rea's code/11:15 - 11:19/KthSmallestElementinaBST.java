import java.util.*;
public class KthSmallestElementinaBST {
	public int kthSmallest(TreeNode root, int k) {
        Stack <TreeNode> s = new Stack <TreeNode>();
        TreeNode p = root;
        int result = 0;
        while (!s.isEmpty() || p != null){
            if (p != null){
            s.push(p);
            p = p.left;
            }
            else {
                TreeNode cur = s.pop();
                k --;
                if (k == 0){
                    return cur.val;
                }
                p = cur.right;
            }
        }
        return result;
    
    }
}
