# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param {TreeNode} root
    # @return {integer[][]}
### solution one    
    def preorder(self, root, level, res):
    	if root:
    		if len(res) < level + 1:
    			res.append([])
    		res[level].append(root.val)
    		self.preorder(root.left, level + 1, res)
    		self.preorder(root.right, level + 1, res)

    def levelOrder(self, root):
    	res = []
    	self.preorder(root, 0, res)
    	return res 

### solution two
    def levelOrder(self, root):
    	if root is None:
    		return []	
    	crt = [root] # keep track of how many roots in the list crt
    	rst = [] # create an empty list to store the result
    	while len(crt):
    		rst.append([i.val for i in crt])
    		nextlvl = []
    		for i in crt:
    			if i.left:
    				nextlvl.append(i.left)
    			if i.right:
    				nextlvl.append(i.right)
    		crt = nextlvl
    	return rst 
