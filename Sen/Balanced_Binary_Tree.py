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
    	return abs(self.getHeight(root.left) - self.getHeight(root.right)) <= 1 and self.isBalanced(root.left) and self.isBalanced(root.right)

    def getHeight(self, root):
    	if root is None: # check if root is a leaf
    		return 0
    	return max(self.getHeight(root.left), self.getHeight(root.right)) + 1 # recursion will end until reaching leaves, max(0, 0) + 1 = 1, so leaves are 1 

    #A well-formed binary tree is said to be "height-balanced" if (1) it is empty, or (2) its left and right children are height-balanced and the height of the left tree is within 1 of the height of the right tree.
