class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        res = []
        for i in range(len(nums) - 2):
        	if i == 0 or (i > 0 and nums[i - 1] != nums[i]): # check if there are duplicates in the sorted nums, and the duplicates will stay together because they are sorted. 
        		left, right = i + 1, len(nums) - 1
        		while left < right:
        			s = nums[i] + nums[left] + nums[right]
        			if s == 0:
        				res.append([nums[i], nums[left], nums[right]])
        				left += 1 # why left and right increase together? 
        				right -= 1 # it is sorted array, so it should be the num in the left side is greater than the num in the right side, if not considering duplicates 
        				# the following conditions to check if there are duplicates as the same as the previous left and the previous right. 
        				while left < right and nums[left] == nums[left - 1]:
        					left += 1
        				while right > left and nums[right] == nums[right + 1]:
        					right -= 1
        			elif s < 0:
        				left += 1
        			else: 
        				right -= 1
        return res 
        		
        	


    # def threeSum(self, nums): # wrong 
    #     nums.sort()
    #     map = {}
    #     neglst = []
    #     poslst = []
    #     rst = []
    #     for num in nums:
    #     	if num <= 0:
    #     		neglst.append(num)
    #     	else:
    #     		poslst.append(num)
    #     for i in range(len(neglst) - 1):
    #     	for j in range(i + 1, len(neglst)):
    #     		if (neglst[i], neglst[i + 1]) not in map: 
    #     			map[(neglst[i], neglst[i + 1])] = 0 + neglst[i] + neglst[i + 1]
    #     for key, val in map.items():
    #     	for num in poslst:
    #     		if val + num == 0:
    #     			rst.append([key[0], key[1], num])
    #     return rst




# nums = [-1, 0, 1, 2, -1, -4]
nums = [-4, -1, -1, -1, -1, 2, 2]
# nums = [0, 0, 0, 0]
i = Solution()
print i.threeSum(nums)

print nums

        