class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        one, two, three = 0, 0, 0
        for i in range(len(nums)):
        	two |= nums[i] & one
        	one = nums[i] ^ one
        	three = ~(one & two)

        	one &= three
        	two &= three
        return one 

nums = [1, 1, 1, 2, 3, 3, 3]
i = Solution()
print i.singleNumber(nums)