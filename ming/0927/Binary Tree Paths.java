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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        if (root == null){
            return result;
        }
        String str = "";
        helper(result, root, str);
        return result;
        
    }
    public void helper(List<String> result, TreeNode root, String str){
        
        str = str + root.val + "->";
        if (root.left == null && root.right == null){
            result.add(str.substring(0, str.length() - 2));
        }
        if (root.left != null){
            helper(result, root.left, str);
            // str = str.substring(0, str.length() - 1); 不需要
        }
        
        if (root.right != null){
            helper(result, root.right, str);
            // str = str.substring(0, str.length() - 1);
        }
    }
}