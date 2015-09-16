class Solution:
    # @param {int[]} A an array of Integer
    # @return {int}  an integer
    def longestIncreasingContinuousSubsequence(self, A):
        # Write your code here
        asc = 1
        desc = 1
        maxAsc = 1
        maxDesc = 1
        
        if len(A)<1:
            return 0
        
        for i in range(1,len(A)):
            if  A[i-1] < A[i]:
                desc = 1
                asc += 1
                maxAsc = max(asc,maxAsc)
            if A[i-1] > A[i]:
                asc = 1
                desc += 1
                maxDesc = max(maxDesc,desc)
            
        maxLen = max(maxAsc,maxDesc)
        return maxLen  
   