class Solution(object):
    def subsetsWithDup(self, nums): # backtracking and closure
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        def dfs(depth, start, valuelist):
            if valuelist not in res: 
                res.append(valuelist)
            if depth == len(nums): 
                return
            for i in range(start, len(nums)):
                dfs(depth+1, i+1, valuelist+[nums[i]])
        nums.sort()
        res = []
        dfs(0, 0, [])
        return res

nums = [1, 2, 3]
i = Solution()
print i.subsetsWithDup(nums)


