# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def generateTrees(self, n):
        """
        :type n: int
        :rtype: List[TreeNode]
        """
        if not n or n == 0:
            return [[]]
        if n == 1:
            tmp = TreeNode(n)
            return [tmp]
        return self.dfs(1, n)
    # why dfs? it constructs each tree from its leaves to root
    def dfs(self, start, end): 
        if start > end: # corner case: start > end, return None
            return [None]
        rst = []
        # if start == end: # optional corner case: start == end, that is, the node is a tree leaf
        #     tmp = TreeNode(start)
        #     rst.append(tmp)
        #     return rst

        for rootVal in range(start, end + 1): # rootVal is root.val and iterating from start to end
            leftTree = self.dfs(start, rootVal - 1)
            rightTree = self.dfs(rootVal + 1, end)
            for i in leftTree: # iterate in left subtrees
                for j in rightTree: # iterate in right subtrees
                    root = TreeNode(rootVal)
                    root.left = i
                    root.right = j 
                    rst.append(root)
        return rst 