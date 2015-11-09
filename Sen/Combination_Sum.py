class Solution(object):
    def combinationSum(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        candidates.sort()
        res = []
        self.dfs(0, [], candidates, target, res)
        return res

    def dfs(self, start, validList, candidates, target, res):
        if target < 0:
            return 
        if target == 0:
            res.append(validList)
            return 
        for i in xrange(start, len(candidates)):
            self.dfs(i, validList + [candidates[i]], candidates, target - candidates[i], res)

    # def dfs(self, start, validList, candidates, target, res): # no duplicate
    #     n = len(candidates)
    #     if sum(validList) == target:
    #             res.append(validList)
    #     if start > n - 1:
    #         return 
    #     for i in range(start, n):
    #         self.dfs(i + 1, validList + [candidates[i]], candidates, target, res)
    


candidates = [1, 2, 3]
target = 3
i = Solution()
print i.combinationSum(candidates, target)


