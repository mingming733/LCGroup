class Solution(object):
    # def sortColors(self, nums): # mine, two-pass, quickSort-like pointers
    #     """
    #     :type nums: List[int]
    #     :rtype: void Do not return anything, modify nums in-place instead.
    #     """
    #     if not nums or len(nums) == 1:
    #         return 
    #     # target number is Zero
    #     j = -1 
    #     for i in range(len(nums)):
    #         if nums[i] == 0:
    #             j += 1
    #             nums[i], nums[j] = nums[j], nums[i]
    #     # target number is One 
    #     k = -1
    #     for i in range(len(nums)):
    #         if nums[i] == 0: # pass Zero in nums
    #             k += 1
    #         if nums[i] == 1:
    #             k += 1
    #             nums[i], nums[k] = nums[k], nums[i]
    #     # return nums 
    
    def sortColors(self, nums): # one-pass
        p0, p2 = 0, len(nums) - 1 # p0 always points to the number after a sequence of Zeroes 
        i = 0                     # p2 always points to the number before a sequence of Twoes 
        while i <= p2:
            if nums[i] == 2:
                nums[i], nums[p2] = nums[p2], nums[i]
                p2 -= 1
            elif nums[i] == 0:
                nums[i], nums[p0] = nums[p0], nums[i]
                p0 += 1
                i += 1
            else:
                i += 1
        # return nums


nums = [1, 0, 2, 0, 1, 2, 0]
i = Solution()
print i.sortColors(nums)