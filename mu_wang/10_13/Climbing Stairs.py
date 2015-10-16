class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n<=0: return 0
        if n==1: return 1
        if n==2: return 2

        return self.climbStairs(n-1)+self.climbStairs(n-2)

a = Solution()
print a.climbStairs(4)