class Solution:
    # @param {int[]} A an array of Integer
    # @return {int}  an integer
    def longestIncreasingContinuousSubsequence(self, A): # DP 
        # Write your code here
        rst = 0
        n = len(A)
        if A is None or n == 0:
          return rst
        fromLeft = True

        start = 0 # start points to the beginning of the subarray
        rst = 1 # i iterate through the array from index 1, so initial value of rst is 1
        for i in range(1, n):
          if A[i] > A[i - 1]: # compare the value of the current and previous
            if fromLeft == True: # check the direction of the subarray
              rst = max(rst, i - start + 1)
            else:
              start = i - 1 # change the direction of the subarray
              fromLeft = True
          elif A[i] < A[i - 1]:
            if fromLeft == False:
              rst = max(rst, i - start + 1)
            else:
              start = i - 1
              fromLeft = False
        return rst 

A = [1, 1, 1, 3]
test = Solution()
print test.longestIncreasingContinuousSubsequence(A)


# wrong 
 	# def longestIncreasingContinuousSubsequence(self, A):
  #       # Write your code here
  #       n = len(A)
  #       if not A:
  #           return 0
  #       if n == 1:
  #           return 1
            
  #       curMax = 0
  #       rstMax = 0
  #       i = 1
  #       # for i in range(n):
  #       while i < n - 1:    
  #           curMax += 1
  #           if A[i] < A[i - 1] and A[i] < A[i + 1]:
  #               rstMax = max(curMax, rstMax)
  #               curMax = 1
  #       rstMax = max(curMax, rstMax)
        
  #       return rstMax

