class Solution(object):
    def combine(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: List[List[int]]
        """
        if not n:
            return []
        res = []
        self.dfs(n, k, 1, [], res)
        return res
        
    def dfs(self, n, k, start, validList, res):
        if k == 0:
            res.append(validList)
            return
        for i in range(start, n + 1):
            self.dfs(n, k - 1, i + 1, validList + [i], res)