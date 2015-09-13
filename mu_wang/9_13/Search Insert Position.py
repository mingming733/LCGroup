class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        index = None
        a = 0
        for i in range(len(nums)):
            if target == nums[i]:
                index = i
                break
            else:
                if target<nums[i]:
                    index= i
                    break
        if index is None:
            index = len(nums)
        return index