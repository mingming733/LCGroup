class Solution:
    # @param nums: a list of integers
    # @return: nothing
    def partitionArray(self, nums):
        # write your code here
        i = 0  #pointer to the front 
        j = len(nums)-1  #pointer to the end
        while i<=j:
            if nums[i]%2==0 and nums[j] % 2==1:
                nums[i],nums[j] = nums[j],nums[i]
            elif nums[i]%2!=0:
                i+=1
            elif nums[j]%2!=1:
                j-=1