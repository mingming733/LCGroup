class Solution(object):
    # def removeDuplicates(self, nums):
    #     """
    #     :type nums: List[int]
    #     :rtype: int
    #     """
    #     k = len(nums) - 1 # bug
    #     for i in range(len(nums) - 1, -1, -1):
    #         j = i
            
    #         while j > -1 and k > -1:
    #             if nums[i] == nums[j] and i != j:
    #                 nums[j], nums[k] = nums[k], nums[j]
    #                 k -= 1
    #             j -= 1
    #     print nums
    #     return k + 1

    # def removeDuplicates(self, nums):
    # 	if not nums:
    # 		return 0
    # 	else:
    # 		i, j = 1, 1
    # 		while j < len(nums):
    # 			if nums[i - 1] != nums[j]:
    # 				nums[i] = nums [j]
    # 				i += 1
    # 			j += 1
    # 		print nums
    # 		return i 

    def removeDuplicates(self, nums): # don't forget that this is a sorted array
    	if not nums:
    		return 0
    	j = 0
    	for i in range(len(nums)):
    		if nums[i] != nums[j]:
    			nums[i], nums[j + 1] = nums[j + 1], nums[i]
    			j = j + 1
    	print nums
    	return j + 1
    # i and j start at the beginning of array. 
    # i iterates through the whole array. j points to the latest duplicate. 
    # Every time i and j point to the same value, j is increased by 1 and i swaps with j + 1 instead of j. 

nums = [1, 1, 1, 2, 2]
test = Solution()
print test.removeDuplicates(nums)