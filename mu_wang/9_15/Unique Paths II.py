class Solution(object):
    def uniquePathsWithObstacles(self, obstacleGrid):
        """
        :type obstacleGrid: List[List[int]]
        :rtype: int
        """
        m = len(obstacleGrid)
        n = len(obstacleGrid[0])
        matrix = [[ 0 for i in range(n) ] for i in range(m)]
        
    
        for i in range(m):
            if obstacleGrid[i][0]==1:
                matrix[i][0] = 0
                break
            else:
                matrix[i][0] = 1
        for i in range(n):
            if obstacleGrid[0][i]==1:
                matrix[0][i] = 0
                break
            else:
                matrix[0][i] = 1

        for i in range(1,m):
            for j in range(1,n):
                if obstacleGrid[i][j]==1:
                    matrix[i][j]=0
                else:
                    matrix[i][j] =matrix[i][j-1]+matrix[i-1][j]
        return matrix[m-1][n-1]