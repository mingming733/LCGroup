# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param {TreeNode} root
    # @param {integer} sum
    # @return {boolean}
    def hasPathSum(self, root, sum): # iteration, DFS 
    	if not root:
            return False
        stack = [(root, root.val)]
        while stack:
            node, s = stack.pop()
            if s == sum and not node.left and not node.right:
                return True
            if node.right:
                stack.append((node.right, s + node.right.val))
            if node.left:
                stack.append((node.left, s + node.left.val))
        return False

    def hasPathSum(self, root, sum): # recursion 
    	if not root:
            return False
        if not root.left and not root.right and root.val == sum:
            return True
        sum -= root.val
        return self.hasPathSum(root.left, sum) or self.hasPathSum(root.right, sum)