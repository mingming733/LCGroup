class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        j= len(nums)-1
        if j<0:
            return 0
        for i in range(len(nums)-1,-1,-1):
            if nums[i] == val:
                nums[i], nums[j] = nums[j],nums[i]
                j-=1
        return j+1
                    