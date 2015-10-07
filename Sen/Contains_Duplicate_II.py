class Solution:
    # @param {integer[]} nums
    # @param {integer} k
    # @return {boolean}
    def containsNearbyDuplicate(self, nums, k):
        d = {}
        for i in range(len(nums)):
            if nums[i] in d:
                j = d[nums[i]]
                if i - j <= k:
                    return True
            d[nums[i]] = i 
        return False

    def containsNearbyDuplicate(self, nums, k):
        d = {}
        for i in range(len(nums)):
            if nums[i] in d:
                pre = d[nums[i]]
                if i - pre <= k:
                    return True
            d[nums[i]] = i 
        return False

