# The isBadVersion API is already defined for you.
# @param version, an integer
# @return a bool
# def isBadVersion(version):

class Solution(object):
    def firstBadVersion(self, n): # iterative 
        """
        :type n: int
        :rtype: int
        """
        low, high = 1, n
        while low < high:
            mid = low + (high - low) / 2 # (high + low) may stack overflow
            if isBadVersion(mid):
                high = mid
            else:
                low = mid + 1
        return low # return high as the same as return low



    # def firstBadVersion(self, n): # recursive
    #     return self.binarySearch(1, n)
        
    # def binarySearch(self, low, high):
    #     if low >= high:
    #         return low
    #     mid = (low + high) / 2
    #     if isBadVersion(mid):
    #         return self.binarySearch(low, mid)
    #     else:
    #         return self.binarySearch(mid + 1, high)

