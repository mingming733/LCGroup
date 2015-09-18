class Solution(object):
    def uniquePaths(self, m, n):
        """
        :type m: int
        :type n: int
        :rtype: int
        """
 
        matrix = [[ 0 for i in range(n) ] for i in range(m)]

        if m==1 or n ==1:
            return 1
        for i in range(m):
            matrix[i][0] = 1
        for i in range(n):
            matrix[0][i] = 1
       
        print matrix
        for i in range(1,m):
            for j in range(1,n):
                matrix[i][j] =matrix[i][j-1]+matrix[i-1][j]
        return matrix[i][j]

a = Solution()
print a.uniquePaths(2,2)