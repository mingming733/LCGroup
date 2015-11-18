class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """

        if not nums:
            return -1
        left, right = 0, len(nums) - 1
        while left <= right: # include the situation: only two items, left and mid point to the first one, and right points to the second one. our target is the second one.
            mid = left +  (right - left) / 2
            if target == nums[mid]:
                return mid
            if nums[mid] >= nums[left]: 
            # the left side is sorted; 
            # in terms of >=, mid may equal to left because integer division leads to lower middle; 
            # only one item left;
                if target < nums[mid] and target >= nums[left]:
                    right = mid - 1
                else:
                    left = mid + 1
            elif nums[mid] < nums[right]: # the right side is sorted
                if target > nums[mid] and target <= nums[right]:
                    left = mid + 1
                else:
                    right = mid - 1
        return -1 

nums = [1]
target = 5
i = Solution()
print i.search(nums, target)