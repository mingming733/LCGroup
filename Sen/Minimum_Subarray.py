class Solution:
    """
    @param nums: a list of integers
    @return: A integer denote the sum of minimum subarray
    """
    # def minSubArray(self, nums): # Memory Limit Exceeded
    #     # write your code here
    #     dic = {}
    #     tmp = 0 
    #     for i in range(len(nums)):
    #         tmp = nums[i]
    #         dic[i] = tmp # push nums[i] into dic
    #         for j in range(i + 1, len(nums)):
    #             tmp = tmp + nums[j]
    #             dic[(i, j)] = tmp # push the sum between i and j into dic
                
    #     lst = [(value, key) for key, value in dic.items()]
    #     minVal = min(lst)[0] # when use max() on a list of tuples, max() just compares the first itme in each tuple.
    #     minKey = min(lst)[1]
        
    #     return minVal

    def minSubArray(self, nums): # Greedy, DP
    	minVal = min(nums)
    	current = 0
    	for a in nums:
    		current += a
    		minVal = min(minVal, current)
    		if current > 0: # current >= 0, that means this subarray doesn't have contribution to minVal
    			current = 0 # so let current = 0 in order to get rid of its 'passive' effect
    	return minVal



nums = [1, -1, -2, 1, -2]
instance = Solution()
print instance.minSubArray(nums)