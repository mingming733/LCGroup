# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution(object):
    def sortedArrayToBST(self, nums):
        """
        :type nums: List[int]
        :rtype: TreeNode
        """
        if not nums:
            return None 
        low, high = 0, len(nums) - 1
        mid = low + (high - low) / 2
        # mid = len(nums) / 2
        node = TreeNode(nums[mid])

        node.left = self.sortedArrayToBST(nums[:mid])
        node.right = self.sortedArrayToBST(nums[mid + 1:])
        return Node

    # def sortedArrayToBST(self, nums):
    #     if not nums:
    #         return 
    #     low, high = 0, len(nums) - 1
    #     mid = low + (high - low) / 2
    #     left, right = mid, mid
    #     leftQueue = []
    #     rightQueue = []
    #     while left - 1 >= low or right + 1 <= high:
    #         if left - 1 >= low:
    #             leftQueue.append(nums[left - 1])
    #             left -= 1
    #         if right + 1 <= high:
    #             rightQueue.append(nums[right + 1])
    #             right += 1

    #     print leftQueue, rightQueue      

    #     root = TreeNode(nums[mid])
    #     preLeftNode, preRightNode = root, root
    #     if leftQueue:
    #         leftFlag = True
    #     else:
    #         leftFlag = False 
    #     while leftQueue or rightQueue:            
    #         if leftFlag and leftQueue:
    #             nodeVal = leftQueue.pop(0)
    #             node = TreeNode(nodeVal)
    #             preLeftNode.left = node
    #             preLeftNode = node
    #             leftFlag = False
    #         elif rightQueue:
    #             nodeVal = rightQueue.pop(0)
    #             node = TreeNode(nodeVal)
    #             preRightNode.right = node
    #             preRightNode = node 
    #             leftFlag = True

    #     print root.val
    #     print root.left.val
    #     print root.right.val 

    #     return root

nums = [1, 2, 3]
i = Solution()
print i.sortedArrayToBST(nums)
