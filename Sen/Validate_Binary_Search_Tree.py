# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isValidBST(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        return self.helper(root, -float("inf"), float("inf"))

    def helper(self, root, MAX, MIN):
        if root == None:
            return True
        if root.val <= MIN or root.val >= MAX:
            return False
        return self.helper(root.left, MIN, root.val) and self.helper(root.right, root.val, MAX)

    # def isValidBST(self, root): fail to handle with the situation, one subtree missing
    #     if not root:
    #         return True
    #     if not root.left and not root.right: # check if the root has no leaves
    #         return True
    #     return self.helper(root) == None
    # def helper(self, root):
    #     if not root.left and not root.right: # check if it is a leaf
    #         return 
    #     else: 
    #         if root.left:
    #             if root.left.val < root.val: # check if leftTree is valid
    #                 return self.helper(root.left)
    #             else:
    #                 return False
    #         if root.right:
    #             if root.right.val > root.val: # check if rightTree is valid
    #                 return self.helper(root.right)
    #             else:
    #                 return False
    #     return 