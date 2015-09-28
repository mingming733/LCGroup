# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def binaryTreePaths(self, root): # iteration, DFS 
    	if not root:
    		return []
    	rst, stack = [], [(root, '')]
    	while stack:
    		node, s = stack.pop()
    		if not node.left and not node.right:
    			rst.append(s + str(node.val))
    		if node.right:
    			stack.append((node.right, s + str(node.val) + '->'))
    		if node.left:
    			stack.append((node.left, s + str(node.val) + '->'))
    	return rst 

    def binaryTreePaths(self, root): # iteration, BFS 
    	if not root:
    		return []
    	rst, queue = [], collections.deque[(root, '')]
    	while queue:
    		node, s = queue.popleft()
    		if not node.left and not node.right:
    			rst.append(s + str(node.val))
    		if node.left:
    			queue.append((node.left, s + str(node.val) + '->'))
    		if node.right:
    			queue.append((node.right, s + str(node.val) + '->'))
    	return rst 

    def binaryTreePaths(self, root): # recursion, DFS
    	if not root:
    		return []
    	rst = []
    	self.dfs(root, "", rst) # subroutine dfs
    	return rst

    def dfs(self, root, s, rst):
    	if not root.left and not root.right:
    		rst.append(s + str(root.val))
        if root.left:
            self.dfs(root.left, s + str(root.val) + "->", rst)
        if root.right:
            self.dfs(root.right, s + str(root.val) + "->", rst) 


