# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution(object):
    def flatten(self, root): # recursive, dfs, strictly in-place
        """
        :type root: TreeNode
        :rtype: void Do not return anything, modify root in-place instead.
        """
        # eliment each level's root's left child
        while root:
            if root.left:
                p = root.left
                while p.right: 
                    p = p.right
                p.right = root.right
                root.right = root.left
                root.left = None
            root = root.right

    def flatten(self, root): # iterative, dfs, loosely in-place 
        if not root:
            return 
        stack = [root]
        while stack:
            curr = stack.pop()
            if curr.right:
                stack.append(curr.right)
            if curr.left:
                stack.append(curr.left)
            if stack:
                curr.right = stack[-1]
            curr.left = None


root = TreeNode(1)
root.left = TreeNode(2)
root.right = TreeNode(5)
root.left.left = TreeNode(3)
root.left.right = TreeNode(4)
root.right.left = TreeNode(6)
i = Solution()
print i.flatten(root)