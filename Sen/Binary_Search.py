class Solution:
    # @param nums: The integer array
    # @param target: Target number to find
    # @return the first position of target in nums, position start from 0 
    def binarySearch(self, nums, target):
        # write your code here
        n = len(nums)
        if not nums or n == 0:
        	return -1
        low, high = 0, n - 1
        while low < high:
        	mid = (high + low) / 2
        	if nums[mid] == target:
        		high = mid # wrong: high = mid - 1, it can't guarantee there is at least one target in the range. 
        	elif nums[mid] < target:
        		low = mid + 1
        	else:
        		high = mid - 1

        if nums[low] == target:
        	return low
        if nums[high] == target:
        	return high
        return - 1 

# nums = [1, 2, 3, 3, 4, 5, 10]
nums = [1, 3, 3] 
target = 3
i = Solution()
print i.binarySearch(nums, target)


