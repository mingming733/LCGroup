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
    public boolean isSymmetric(TreeNode root) {
        if(root==null ){//|| help(root.left,root.right)){
            return true;
        }
        return help(root.left,root.right);
    }
    public boolean help(TreeNode left, TreeNode right){
        if(left==null &&right==null){
            return true;
        }
        if((left==null &&right!=null)||(left!=null &&right==null)){
            return false;
        }
        if(left.val!=right.val){
            return false;
        }
        return help(left.left,right.right) && help(left.right,right.left);
    }
}
