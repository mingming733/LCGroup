# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param {TreeNode} root
    # @return {boolean}
    def isBalanced(self, root):
    	if root is None:
    		return True
    	return abs(self.getHeight(root.left) - self.getHeight(root.right)) <= 1 \
    	and self.isBalanced(root.left) and self.isBalanced(root.right)

    def getHeight(self, root):
    	if root is None:
    		return 0
    	return max(self.getHeight(root.left), self.getHeight(root.right)) + 1
