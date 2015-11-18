class Solution(object):
    def findPeakElement(self, nums): # the local maximum is one valid peak
        """
        :type nums: List[int]
        :rtype: int
        """
        return self.helper(nums, 0, len(nums) - 1)

    def helper(self, nums, low, high):
        if low == high:
            return low
        else:
            mid1 = (low + high) / 2
            mid2 = mid1 + 1
            if nums[mid1] > nums[mid2]:
                return self.helper(nums, low, mid1)
            else:
                return self.helper(nums, mid2, high)

    # def findPeakElement(self, nums): # sequential 
    #     if not nums:
    #         return 
    #     n = len(nums)
    #     if n == 1 or nums[0] > nums[1]:
    #         return 0
    #     if nums[n - 1] > nums[n - 2]:
    #         return n - 1
    #     for i in range(n - 2):
    #         print i 
    #         if nums[i] <= nums[i + 1] and nums[i + 1] > nums[i + 2]:
    #             return i + 1

# nums = [1, 2, 3, 4]
# nums = [4, 3, 2, 1]
# nums = [1, 3, 2, 4]
nums = [3, 1, 2, 4]
i = Solution()
print i.findPeakElement(nums)