class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        j = len(nums) - 1 # j points to the last item which is not equal to val
        for i in range(len(nums) - 1, -1, -1): # backtracking
            if nums[i] == val:
                nums[i], nums[j] = nums[j], nums[i] # it doesn't matter what you leave beyond the new length
                j -= 1
        return j + 1 # the index of array begins from 0, so the new length is j + 1
        
    # def removeElement(self, nums, val):
        # if not nums:
        #   return 
        # cnt = 0
        # lst = list(nums)
        # for i in lst:
        #   cnt += 1
        #   if i == val:
        #     nums.remove(i)
        #     cnt -= 1 
        # return cnt
        
    # def removeElement(self, nums, val):
        # i = 0
        # for number in nums:
        #     if number != val:
        #         nums[i] = number
        #         i += 1
        # print nums
        # return i