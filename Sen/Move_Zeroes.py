class Solution(object):
    # def moveZeroes(self, nums):
    #     """
    #     :type nums: List[int]
    #     :rtype: void Do not return anything, modify nums in-place instead.
    #     """
    #     n = len(nums) # length of nums
    #     runningN = n  # length of the original length minus the number of zero in the tail of nums
    #     if not n:
    #         return 
    #     i = n - 1
    #     while i >= 0:
    #         if nums[i] == 0:
    #             j = i
    #             while j <= runningN - 2:
    #                 nums[j] = nums[j + 1]
    #                 j += 1
    #             nums[runningN - 1] = 0
    #             runningN -= 1
    #         i -= 1

    def moveZeroes(self, nums): # keep zero between i and j
        j = 0 # j points to the first zero
        for i in range(len(nums)):
            if nums[i]:
                nums[i], nums[j] = nums[j], nums[i]
                j += 1 

            



nums = [0, 1, 0, 3, 12]
print nums
i = Solution()
i.moveZeroes(nums)
print nums