class Solution:
    """
    @param nums: The rotated sorted array
    @return: nothing
    """

            
    def recoverRotatedSortedArray(self, nums):
        # write your code here
        for i in range(len(nums)-1):
            if nums[i+1]<nums[i]:
                reverse(nums,0,i)
                reverse(nums,i+1,len(nums)-1)
                reverse(nums,0,len(nums)-1)
                

def reverse(A,i,j):
    
    while i<j:
        A[i],A[j] = A[j],A[i]
        i+=1
        j-=1