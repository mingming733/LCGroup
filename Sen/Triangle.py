class Solution(object):
    def minimumTotal(self, triangle): # top-down DP
        """
        :type triangle: List[List[int]]
        :rtype: int
        """
        if len(triangle) == 0: 
            return 0
        array = [0 for i in range(len(triangle))] # create an array with the length of the base of the triangle 
        array[0] = triangle[0][0]
        for i in range(1, len(triangle)):
            for j in range(len(triangle[i]) - 1, -1, -1):
                if j == len(triangle[i]) - 1: # the right side of the triangle
                    array[j] = array[j - 1] + triangle[i][j]
                elif j == 0: # the left side of the triangle
                    array[j] = array[j] + triangle[i][j]
                else: # inside the triangle
                    array[j] = min(array[j - 1], array[j]) + triangle[i][j]
        return min(array)

    def minimumTotal(self, triangle): # bottom-up DP
        n = len(triangle)
        res = triangle[-1]
        for i in range(n - 2, -1, -1):
            for j in range(len(triangle[i])):
                res[j] = min(res[j], res[j + 1]) + triangle[i][j]
        return res[0]
triangle = [
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
i = Solution()
print i.minimumTotal(triangle)



