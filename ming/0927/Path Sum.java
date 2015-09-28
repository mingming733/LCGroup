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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null){
            return false;
        }
        return helper(root, 0, sum);
    }
    public boolean helper(TreeNode root, int pathSum, int sum){
        if (root.left == null && root.right == null){
            return pathSum + root.val == sum;
        }else if(root.right == null){
            return helper(root.left, pathSum + root.val, sum);
        }else if (root.left == null){
            return helper(root.right, pathSum + root.val, sum);
        }else{
        return (helper(root.left, pathSum + root.val, sum) || helper(root.right, pathSum + root.val, sum));
        }
        
    }
}