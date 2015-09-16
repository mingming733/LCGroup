class Solution(object):
    def searchInsert(self, nums, target): # binary search, time: O(logn)
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        low, high = 0, len(nums) - 1
        while low <= high:
        	mid = (low + high) / 2
        	if nums[mid] == target:
        		return mid
        	else:
        		if nums[mid] > target:
        			high = mid - 1
        		else:
        			low = mid + 1
        return low 

nums = [1, 2]
target = 7
i = Solution()
print i.searchInsert(nums, target)


    # def searchInsert(self, nums, target): # sequential search 
    #     """
    #     :type nums: List[int]
    #     :type target: int
    #     :rtype: int
    #     """
    #     if not nums:
    #         return 0
            
    #     n = len(nums)   
    #     if target in nums:
    #         for i in range(n): # sequential search
    #             if target == nums[i]:
    #                 return i
    #     elif n == 1:
    #         if target > nums[0]:
    #             return 1
    #         else:
    #             return 0
    #     else:
    #         for i in range(n):
    #             if target < nums[i] and i == 0:
    #                 return 0
    #             elif target > nums[i] and target < nums[i + 1]:
    #                 return i + 1
    #             elif target > nums[n - 1]:
    #                 return n

