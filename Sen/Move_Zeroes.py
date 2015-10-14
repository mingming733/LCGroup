class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        if not n:
            return 
        i = n - 1
        cnt = 0
        while i >= 0:
            if nums[i] == 0:
                key = nums[i]
                j = i
                while j <= n - 2:
                    nums[j] = nums[j + 1]
                    j += 1
                nums[n - 1] = key
            i -= 1