class Solution(object):
    # def rotate(self, matrix):
    #     """
    #     :type matrix: List[List[int]]
    #     :rtype: void Do not return anything, modify matrix in-place instead.
    #     """
    #     matrix.reverse()
    #     for i in range(len(matrix)):
    #         for j in range(i):
    #             matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]

    def rotate(self, matrix):
        n = len(matrix)
        for i in range(n / 2):
            for j in range(i, n - 1 - i):
                key = matrix[i][j]
                matrix[i][j] = matrix[n - 1 - j][i]
                matrix[n - 1 - j][i] = matrix[n - 1 -i][n - 1 - j]
                matrix[n - 1 -i][n - 1 - j] = matrix[j][n - 1 - i]
                matrix[j][n - 1 - i] = key

    # def rotate(self, matrix): wrong
    #     if not matrix:
    #         return 
    #     if len(matrix) == 1:
    #         return matrix 
    #     n = len(matrix)
    #     upperL, upperR, lowerL, lowerR = (0, 0), (0, n - 1), (n - 1, n - 1), (n - 1, 0)
    #     return self.helper(upperL, upperR, lowerL, lowerR, n)
    # def helper(self, upperL, upperR, lowerL, lowerR, n):
    #     if n == 1:
    #         return 
    #     m = n / 2 + 1
    #     for i in range(m):
    #         key = matrix[upperL[0]][upperL[1] + i]
    #         matrix[upperL[0]][upperL[1] + i] = matrix[upperR[0] + i][upperR[1]]
    #         matrix[upperR[0] + i][upperR[1]] = matrix[lowerR[0]][lowerR[1] - i]
    #         matrix[lowerR[0]][lowerR[1] - i] = matrix[lowerL[0] - i][lowerL[1]]
    #         matrix[lowerL[0] - i][lowerL[1]] = key 
    #     if n ==
    #     return self.helper(matrix[upperL[0] + 1][upperL[1] + 1], matrix[upperR[0] + 1][upperR[1] - 1], matrix[lowerR[0] - 1][lowerR[1] - 1], matrix[lowerL[0] - 1][lowerL[1] + 1], n - 2)


    # def rotate(self, matrix): non-in-place
    #     if not matrix:
    #         return 
    #     if len(matrix) == 1:
    #         return matrix 
    #     n = len(matrix)
    #     table = [[] for i in range(n)]
    #     for i in range(n):
    #         for j in range(n - 1, -1, -1):
    #             table[i].append(matrix[j][i])
    #     return table 

matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
# matrix = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
i = Solution()
print i.rotate(matrix)