class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        map = {}
        for i in range(len(nums)):
            if nums[i] not in map:
                map[target - nums[i]] = i + 1
            else:
                return map[nums[i]], i + 1
        return -1, -1

    # def twoSum(self, nums, target): # Time Limited Error
    #     if not nums:
    #         return []
        
    #     rst = []
    #     n = len(nums)
        
    #     for i in range(n):
    #         j = n - 1
    #         while j > i:
    #             if nums[i] + nums[j] == target:
    #                 rst.append([i + 1, j + 1])
    #             j -= 1
    #     return rst


nums = [3, 2, 4]
target = 6
i = Solution()
print i.twoSum(nums, target)