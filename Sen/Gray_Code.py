class Solution(object):
    def grayCode(self, n):
        """
        :type n: int
        :rtype: List[int]
        """
        return [(i >> 1) ^ i for i in range(2 ** n)]

n = 3
i = Solution()
print i.grayCode(n)