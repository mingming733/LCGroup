# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param {TreeNode} p
    # @param {TreeNode} q
    # @return {boolean}      

	def isSameTree(self, p, q):
		if p and q: # both p and q are not None
			return p.val == q.val and self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)
		return p == q # one is None, return False; or both are None, return True 
									    
	def isSameTree(self, p, q):
		if p == None and q == None: # both p and q are None
			return True
		if p and q and p.val == q.val: # both p and q are not None, and their values are equal
			return self.isSameTree(p.left, q.left) and self.(p.right, q.right)
		return False



