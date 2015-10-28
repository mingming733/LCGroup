class Solution(object):
    def minPathSum(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        m = len(grid) # the width of grid
        n = len(grid[0]) # the length of grid

        dp = [[0 for i in range(n)] for j in range(m)]
        # dp = [[0] * n] * m

        dp[0][0] = grid[0][0]
        for i in range(1, n): # fill out the first row
            dp[0][i] = dp[0][i-1] + grid[0][i]
        for i in range(1, m): # fill out the first column 
            dp[i][0] = dp[i-1][0] + grid[i][0]
        for i in range(1, m): # fill out the rest of table 
            for j in range(1, n):
                dp[i][j] = min(dp[i-1][j], dp[i][j-1]) + grid[i][j]
        return dp[m-1][n-1]

grid = [[1, 1, 2], [3, 2, 1], [2, 1, 1]]
i = Solution()
print i.minPathSum(grid)