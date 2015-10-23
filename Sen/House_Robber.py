class Solution(object):
    # def rob(self, nums):
    #     """
    #     :type nums: List[int]
    #     :rtype: int
    #     """
    #     n = len(nums)
    #     dp = [0] * (n + 1)
    #     if n:
    #     	dp[1] = nums[0]
    #     for i in range(2, n + 1):
    #     	dp[i] = max(dp[i - 1], dp[i - 2] + nums[i - 1])
    #     return dp[n]

    def rob(self, nums):
    	n = len(nums)
    	odd, even = 0, 0
    	for i in range(n):
    		if i % 2:
    			odd = max(odd + nums[i], even)
    		else:
    			even = max(even + nums[i], odd)
    	return max(odd, even)   

nums = [4, 8, 2, 2, 10]
i = Solution()
print i.rob(nums)