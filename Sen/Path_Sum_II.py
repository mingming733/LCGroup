# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution(object):
    def pathSum(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: List[List[int]]
        """
        if not root:
            return []
        res = []
        self.dfs(root, root.val, [root.val], res, sum)
        return res
        
    def dfs(self, root, curSum, validList, res, sum):
        if not root.left and not root.right: 
            if curSum == sum:
                res.append(validList)
        if root.left:
            self.dfs(root.left, curSum + root.left.val, validList + [root.left.val], res, sum)
        if root.right:
            self.dfs(root.right, curSum + root.right.val, validList + [root.right.val], res, sum)

    # def dfs(self, root, curSum, validList, res, sum): # wrong
    #     curSum += root.val
    #     validList.append(root.val)
    #     if curSum == sum:
    #         if not root.left and not root.right: 
    #             res.append(validList)
    #             return res
    #     if root.left:
    #         self.dfs(root.left, curSum, validList, res, sum) 
    #     if root.right:
    #         self.dfs(root.right, curSum, validList, res, sum) # previous curSum and validList will affect
    #     return 
sum = 22
root = TreeNode(5)
root.left = TreeNode(4)
root.right = TreeNode(8)
root.left.left = TreeNode(11)
root.right.left = TreeNode(13)
root.right.right = TreeNode(4)
root.left.left.left = TreeNode(7)
root.left.left.right = TreeNode(2)
root.right.right.left = TreeNode(5)
root.right.right.right = TreeNode(1)
i = Solution()
print i.pathSum(root, sum)