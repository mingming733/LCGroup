class Solution(object):
    def numTrees(self, n): # DP
        """
        :type n: int
        :rtype: int
        """
        rst = [0] * (n + 1)
        rst[0], rst[1] = 1, 1
        for i in range(2, n + 1):
            for j in range(1, i + 1):
                rst[i] += rst[j - 1] * rst[i - j]
        return rst[n]
# G(n) = F(1, n) + F(2, n) + ... + F(n, n)
# G(0)=1, G(1)=1
# F(i, n) = G(i-1) * G(n-i)   1 <= i <= n
# G(n) = G(0) * G(n-1) + G(1) * G(n-2) + … + G(n-1) * G(0)

        
    # def arrayToBST(self, A): # Wrong
    #     if not len(A):
    #         return 0
    #     if len(A) == 1:
    #         return 1

    #     for i in A:
    #         root = A[i]
    #         leftTree = []
    #         rightTree = []
    #         for j in A:
    #             if j != i:
    #                 if A[j] > A[i]:
    #                     rightTree.append(A[j])
    #                 elif A[j] < A[i]:
    #                     leftTree.append(A[j])
    #         return self.arrayToBST(rightTree) + self.arrayToBST(leftTree)
            
            
                