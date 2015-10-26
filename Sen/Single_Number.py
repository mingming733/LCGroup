class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        rst = 0
        for i in range(len(nums)):
        	rst ^= nums[i]
        return rst

# exclusive or: x ^ 0 = x; x ^ x = 0; x ^ y ^ y = x; 

nums = [1, 1, 2, 2, 3, 4, 4]
i = Solution()
print i.singleNumber(nums)

