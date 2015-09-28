# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def zigzagLevelOrder(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        rst,next = [],[]
        if root:
            temp = [root]
        else:
            return rst
        rst.append(temp)
        while True:
            for v in temp:
                if v.left:
                    next.append(v.left)
                if v.right:
                    next.append(v.right)
            if next == []:
                break
            temp = next
            rst.append(next)
            next = []
        final = []
        temp = []
        for i in range(len(rst)):
            if i % 2 !=0:
                rst[i] = reversed(rst[i])
            final.append( [ v.val for v in rst[i]])
        return final