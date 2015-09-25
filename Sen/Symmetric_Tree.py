# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param {TreeNode} root
    # @return {boolean}

### recursive solution 1: 
    def isSymmetric(self, root):
	    if not root:
	    	return True
	    else:
	    	return self.isMirror(root.left, root.right)

	def isMirror(self, left, right):
		if left == right == None: 
			return True
		if left is None or right is None:
			return False
		if left.val == right.val:
			outPair = self.isMirror(left.left, right.right)
			inPair = self.isMirror(left.right, right.left)
			return outPair and inPair
		else:
			return False
    ### simplied version
	# def isMirror(self, left, right):
	# 	if node1 and node2:
	# 		return node1.val == node2.val and self.isMirror(left.left, right.right) and self.isMirror(left.right, right.left)
	# 	else:
	# 		return left == right