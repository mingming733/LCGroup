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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null){
            return null;
        }
        return buildtree(nums,0,nums.length-1);
    }
    private TreeNode buildtree(int[] nums,int start, int end){
        if(start>end){
            return null;
        }
        TreeNode node =new TreeNode(nums[(end+start)/2]);
        
        node.left=buildtree(nums,start,(end+start)/2-1);
        node.right=buildtree(nums,(end+start)/2+1,end);
        return node;
    }
}
