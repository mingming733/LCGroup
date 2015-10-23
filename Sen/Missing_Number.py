class Solution(object):
    # def missingNumber(self, nums): # Math
    #     """
    #     :type nums: List[int]
    #     :rtype: int
    #     """
    #     n = len(nums)
    #     return n * (n + 1) / 2 - sum(nums)

    # def missingNumber(self, nums): # Bits Munipulation
    # 	rst = len(nums)
    # 	for i in range(len(nums)):
    # 		rst ^= i
    # 		rst ^= nums[i]
    # 	return rst

    def missingNumber(self, nums): # Binary Search
    	nums.sort()
    	left, right = 0, len(nums)
    	mid = (left + right) / 2
    	while left < right:
    		mid = (left + right) / 2
    		if nums[mid] > mid:
    			right = mid
    		else:
    			left = mid + 1
    	return left 


nums = [0, 1, 3]
i = Solution()
print i.missingNumber(nums)
