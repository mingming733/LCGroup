class Solution(object):
    # def permute(self, nums):
    #     """
    #     :type nums: List[int]
    #     :rtype: List[List[int]]
    #     """
    #     if len(nums) == 0: return []
    #     if len(nums) == 1: return [nums]
    #     res = []
    #     for i in range(len(nums)):
    #         for j in self.permute(nums[:i] + nums[i+1:]):
    #             res.append([nums[i]] + j)
    #     return res

    def permute(self, nums):
    	perms = [[]]
    	for n in nums:
    		new_perms = []
    		for perm in perms:
    			for i in xrange(len(perm) + 1):
    				new_perms.append(perm[:i] + [n] + perm[i:])
    		perms = new_perms
    	return perms 

# nums = [1]
nums = [1, 2, 3]
i = Solution()
print i.permute(nums)