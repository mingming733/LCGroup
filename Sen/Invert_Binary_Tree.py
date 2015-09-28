# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param {TreeNode} root
    # @return {TreeNode}
    def invertTree(self, root): # recursion
    	if root:
    		root.left, root.right = self.invertTree(root.right), self.invertTree(root.left)
    		return root

    def invertTree(self, root): # iteration, DFS
    	stack = [root]
    	while stack:
    		node = stack.pop()
    		if node:
    			node.left, node.right = node.right, node.left
    			# stack.append(node.right)
    			# stack.append(node.left)
    			# or 
    			# stack.extend([node.right, node.left])
    			stack += node.right, node.left # the same as the code above
    	return root

    def invertTree(self, root): # iteration, BFS
    	queue = [root]
    	while queue:
    		node = queue.pop(0)
    		node.left, node.right = node.right, node.left
    		# if node.left: # if check if node is None or not, then all the items in the queue will pass while loop otherwise while loop will check and the same thing as if node.left 
    		queue.append(node.left)
    		# if node.right:
    		queue.append(node.right)
    	return root 

    # def invertTree(self, root): # mine 
    # 	if not root:
    #         return
    #     if not root.left and not root.right: # no need to do this
    #         return root
    #     self.invertTree(root.left)
    #     self.invertTree(root.right)
    #     root.left, root.right = root.right, root.left
    #     return root