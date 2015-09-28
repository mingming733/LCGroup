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
        rst = []
        self.addlevel(rst, 0, root) # level from 0 
        return rst 

    def addlevel(self, rst, level, root):
        if not root: # check if root is a leaf 
            return 
        elif len(rst) <= level: # when reaching a new level: 1. '<' when rst is empty; 2. '=' after inserting rootnode, len(srt) always is equal to the new level because level begins from 0 
            rst.append([root.val])
        elif not level % 2: # if it is an even level, ordinal
            rst[level].extend([root.val])
        else: # if it is an odd level, reversed 
            rst[level].insert(0, root.val)
        self.addlevel(rst, level + 1, root.left)
        self.addlevel(rst, level + 1, root.right)


    # def zigzagLevelOrder(self, root): # Time Limited Error
    #     if not root:
    #         return []
            
    #     rst = []
    #     crt = [root]
    #     fromRight = True
    #     while len(crt):
    #         rst.append([i.val for i in crt])
    #         nextlvl = []
    #         if fromRight: 
    #             for i in crt: 
    #                 if root.right:
    #                     nextlvl.append(root.right)
    #                 if root.left:
    #                     nextlvl.append(root.left)
    #                 crt = nextlvl
    #                 fromRight = False
    #         else:
    #             for i in crt:
    #                 if root.left:
    #                     nextlvl.append(root.left)
    #                 if root.right:
    #                     nextlvl.append(root.right)
    #                 crt = nextlvl
    #                 fromRight = True
    #     return rst








        