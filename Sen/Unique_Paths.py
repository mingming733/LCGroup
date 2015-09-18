class Solution(object):
    def uniquePaths(self, m, n):
        """
        :type m: int
        :type n: int
        :rtype: int
        """
        if m == 1 and n == 1:
        	lst = [[1]]
        elif m == 1 and n > 1:
        	lst = [[1 for i in range(n)]]
        elif m > 1 and n == 1:
        	lst = [[1 for i in range(m)]]
        else:
        	lst = [[0 for i in range(n)] for i in range(m)]
        	for i in range(n):
        		lst[0][i] = 1
        	for i in range(m):
        		lst[i][0] = 1
        	for i in range(1, m):
        		for j in range(1, n):
        			lst[i][j] = lst[i - 1][j] + lst[i][j - 1]
        return lst[m - 1][n - 1]

m = 3 
n = 7
i = Solution()
print i.uniquePaths(m, n)
