# The isBadVersion API is already defined for you.
# @param version, an integer
# @return a bool
# def isBadVersion(version):

class Solution(object):
    def firstBadVersion(self, n):
        """
        :type n: int
        :rtype: int
        """ 

        if isBadVersion(1):
            return 1
        if isBadVersion(2):
            return 2 
        return self.helper(1,n,(n+1)/2)
        
    def helper(self,low,high,middle):
        if low>=high:
            if not isBadVersion(high):
                return high +1
            else:
                return high
        if isBadVersion(middle):
            high = middle-1
        else:
            low = middle+1
        middle = (high+low)/2
        return self.helper(low,high,middle)