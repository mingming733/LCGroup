class Solution:
    # @param nums: a list of integers
    # @return: nothing
    def partitionArray(self, nums):
        # write your code here
        n = len(nums)
        if nums is None or n <= 1:
        	return 
        start, end = 0, n - 1
        while start < end:
        	while start < end and nums[start] % 2 != 0:
        		start += 1
        	while start < end and nums[end] % 2 == 0:
        		end -= 1
        	if start < end:
        		nums[start], nums[end] = nums[end], nums[start] 
        		start += 1
        		end -= 1

nums = [1, 2, 3, 4]
i = Solution()
i.partitionArray(nums)
print nums