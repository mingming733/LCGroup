class Solution(object):
    def singleNumber(self, nums): # linear time but not constant space
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        if not len(nums):
            return []
        rst = []
        d = {}
        for i in range(len(nums)):
            if nums[i] not in d:
                d[nums[i]] = 1
            else:
                d[nums[i]] += 1
        
        for item in d.items():
            if item[1] == 1:
                rst.append(item[0])
        return rst