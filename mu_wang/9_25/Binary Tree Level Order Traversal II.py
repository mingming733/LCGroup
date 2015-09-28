# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def levelOrderBottom(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        res,next=[],[]
        if root:
            temp=[root]
        else:
            return res
        res.append(temp)
        while 1:
            for v in temp:
                if v.left:
                    next.append(v.left)                
                if v.right:
                    next.append(v.right)
            if next==[]:
                break
            res.append(next)
            temp=next
            next=[]
        return [[v.val for v in x] for x in reversed(res)]