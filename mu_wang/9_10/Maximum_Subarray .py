class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums)<1:
            return 0
        curMax = nums[0]
        result = nums[0]
        for i in range(1,len(nums)):
            curMax = max(nums[i],curMax+nums[i])
            result = max(result,curMax)
            
        return result