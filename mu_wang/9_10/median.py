class Solution:
    """
    @param nums: A list of integers.
    @return: An integer denotes the middle number of the array.
    """
    def median(self, nums):
        # write your code here
        n = len(nums)
        if n<1:
            return
        if n<2:
            return nums[0]
        nums = sort(nums)
        flag = has_even(nums)
        if n % 2 == 1 or flag:

            return nums[(n-1)/2]
        else:
            return (nums[n/2]+nums[n/2+1])/2
    

def sort(lst):
    if len(lst)<=1:
        return lst
    pivot = lst.pop()
    before = [x for x in lst if x<pivot]
    after = [x for x in lst if x >= pivot]
    return sort(before)+[pivot]+sort(after)

def has_even(lst):
    for i in lst:
        if i % 2 == 0:
            return True
    return False

a = Solution()
print a.median([4,5,1,2,3])
