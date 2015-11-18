class Solution(object):
    # def searchMatrix(self, matrix, target): # O(lgm + lgn)
    #     """
    #     :type matrix: List[List[int]]
    #     :type target: int
    #     :rtype: bool
    #     """
    #     if not matrix:
    #         return 

    #     row = 0
    #     # find the row with target
    #     low, high = 0, len(matrix) - 1
    #     while low <= high:
    #         mid = low + (high - low) / 2
    #         if target >= matrix[mid][0] and target <= matrix[mid][len(matrix[mid]) - 1]:
    #             row = mid
    #             break
    #         elif target <= matrix[mid][0]:
    #             high = mid - 1
    #         elif target > matrix[mid][len(matrix[mid]) - 1]:
    #             low = mid + 1
    #     # find the column with target
    #     low, high = 0, len(matrix[row]) - 1
    #     while low <= high:
    #         mid = low + (high - low) / 2
    #         if target == matrix[row][mid]:
    #             return True
    #         elif target <= matrix[row][mid]:
    #             high = mid - 1
    #         else:
    #             low = mid + 1
        
    #     return False

    def searchMatrix(self, matrix, target): # 
        m, n = len(matrix[0]), len(matrix)
        l, r = 0, m * n - 1 # treat the matrix as an sorted list instead of matrix
        while l != r:
            mid = (l + r) / 2
            if matrix[mid / m][mid % m] < target:
                l = mid + 1
            else:
                r = mid
        return matrix[r / m][r % m] == target

        
# nums = [[1, 2, 3], [5, 7, 9], [12, 14, 20]]
nums = [[-10,-8,-6,-4,-3],[0,2,3,4,5],[8,9,10,10,12]]
target = -19
i = Solution()
print i.searchMatrix(nums, target)
