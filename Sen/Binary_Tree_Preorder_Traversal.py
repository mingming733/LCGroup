# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def preorderTraversal(self, root): # iterative 
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        if not root:
            return []
        rst = []
        stack = [root]
        while stack: 
            node = stack.pop()
            rst.append(node.val)
            if node.right:
                stack.append(node.right)
            if node.left:
                stack.append(node.left)
        return rst

    def preorderTraversal(self, root): # recursive
        rst = [] # run a subroutine to avoid initialize a list each recursion
        self.helper(root, rst)
        return rst

    def helper(root, rst):
        if not root:
            return 
        rst.append(root.val)
        self.helper(root.left, rst)
        self.helper(root.right, rst)


