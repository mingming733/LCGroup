class Solution:
    """
    @param nums: a list of integers
    @return: A integer denote the sum of minimum subarray
    """
    def minSubArray(self, nums):
        # write your code here
        if len(nums)<1:
            return 0
        curMin = nums[0]
        result = nums[0]
        for i in range(1,len(nums)):
            curMin = min(nums[i],curMin+nums[i])
            result = min(result,curMin)
        
        return result