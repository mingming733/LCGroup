class Solution(object):
    def uniquePathsWithObstacles(self, obstacleGrid):
        """
        :type obstacleGrid: List[List[int]]
        :rtype: int
        """
        m = len(obstacleGrid)
        n = len(obstacleGrid[0])

        if m == 1 and n == 1 and obstacleGrid[0][0] == 0: # 
            return 0 

        res = [[0 for i in range(n)] for j in range(m)]
        for i in range(m): # check if there exists obstacle in the first row
        	if obstacleGrid[i][0] == 0:
        		res[i][0] = 1
        	else:
        		res[i][0] == 0 
        		break 
        for i in range(n): # check if there exists obstacle in the first column 
        	if obstacleGrid[0][i] == 0:
        		res[0][i] = 1
        	else:
        		res[0][i] == 0 
        		break
        for i in range(1, m):
        	for j in range(1, n):
        		if obstacleGrid[i][j] == 1:
        			res[i][j] = 0
        		else:
        			res[i][j] = res[i - 1][j] + res[i][j - 1]
        print res
        return res[m - 1][n - 1]

obstacleGrid = [[0]]
i = Solution()
print i.uniquePathsWithObstacles(obstacleGrid)
