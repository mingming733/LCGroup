# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param {TreeNode} root
    # @return {integer}
    def minDepth(self, root):
        if root is None:
            return 0
        if root.left is None or root.right is None: # include three conditions: both are None, root.left is None, root.right is None
            return max(self.minDepth(root.left), self.minDepth(root.right)) + 1 
        else:
            return min(self.minDepth(root.left), self.minDepth(root.right)) + 1


    def minDepth(self, root): # mine 
    	if not root:
    		return 0
    	if not root.left and not root.right:
    		return 1
    	if root.left and root.right:
    		return min(self.minDepth(root.left), self.minDepth(root.right)) + 1
    	elif root.left: 
    		return self.minDepth(root.left) + 1
    	else:
    		return self.minDepth(root.right) + 1


    	
    		
