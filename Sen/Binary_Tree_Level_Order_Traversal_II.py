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
        if root is None:
        	return []
        crt = [root]
        rst = []
        while len(crt):
        	rst.insert(0, [i.val for i in crt]) # reverse the noods
        	nextlvl = []
        	for i in crt:
        		if i.left:
        			nextlvl.append(i.left)
        		if i.right:
        			nextlvl.append(i.right)
        	crt = nextlvl
        # rst = list(reversed(rst)) # it has to have "list()" because reversed() just return an reversed iterator instead of list. 
        return rst
