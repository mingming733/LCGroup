class Solution:
    # @param nums: The integer array
    # @param target: Target number to find
    # @return the first position of target in nums, position start from 0 
    def binarySearch(self, nums, target):
        # write your code here
        low = 0
        high = len(nums)-1
        minMid = high
        found = False
        while low<=high:
            mid = low + (high-low)/2
            if target < nums[mid]:
                high = mid-1
            elif target> nums[mid]:
                low = mid+1
            else:
                minMid = min(mid,minMid)
                high = mid-1
                found = True
        if found:
            return minMid
        else:
            return -1