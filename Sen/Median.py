class Solution:
    """
    @param nums: A list of integers.
    @return: An integer denotes the middle number of the array.
    """
    def median(self, nums):
        # write your code here
        if not nums:
            return 0
            
        nums.sort()
        n = len(nums)
        if n % 2 == 0:
            return nums[(n / 2) - 1]
        else:
            return nums[n / 2]