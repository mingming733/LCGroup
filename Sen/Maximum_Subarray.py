class Solution(object):
    def maxSubArray(self, nums): # Greedy, DP
        """
        :type nums: List[int]
        :rtype: int
        """
        maxVal = max(nums)
        current = 0
        for a in nums:
            current += a
            maxVal = max(maxVal, current)
            if current < 0:
                current = 0
        return maxVal

    def maxSubArray(self, nums): # DP
    	if not nums:
    		return 0
    	curSum = maxSum = nums[0]
    	for num in nums[1:]:
    		curSum = max(num, curSum + num)
    		maxSum = max(maxSum, curSum)
    	return maxSum

    def maxSubArray(self, nums): # Divide and Conquer





