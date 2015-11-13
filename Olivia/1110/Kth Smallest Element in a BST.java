/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int num=countNodes(root.left);
        if(k<=num){
            return kthSmallest(root.left,k);
        }
        else if(k>num+1){
            return kthSmallest(root.right,k-1-num);
        }
        return root.val;
    }
    public int countNodes(TreeNode n){
        if(n==null){
            return 0;
        }
        return 1+countNodes(n.left)+countNodes(n.right);
        
    }
}
