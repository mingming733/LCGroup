# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def kthSmallest(self, root, k):
        """
        :type root: TreeNode
        :type k: int
        :rtype: int
        """
        count = self.countNodes(root.left)
        if k <= count:
            return self.kthSmallest(root.left, k)
        elif k > count + 1:
            return self.kthSmallest(root.right, k - 1 - count)
        return root.val
    
    def countNodes(self, node):
        if not node:
            return 0
        return 1 + self.countNodes(node.left) + self.countNodes(node.right)

           8
      3       12
    1   7   10   13
    
1 3 7 8 10 12 13 
    # def kthSmallest(self, root, k):
    #     if not root:
    #         return
    #     lst = []
    #     self.dfs(root, lst)
    #     return lst[k - 1]
        
    # def dfs(self, root, lst):
    #     if not root.left and not root.right:
    #         lst.append(root.val)
    #     else:
    #         if root.left:
    #             self.dfs(root.left, lst)
    #         lst.append(root.val)
    #         if root.right:
    #             self.dfs(root.right, lst)
        