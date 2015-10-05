class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        numSet = set() # the set in python is implemented by dic and dic by hashtable
        for num in nums: # O(1) instead of O(n) if using the list
            if num in numSet:
                return True
            numSet.add(num)
        return False

    def containsDuplicate(self, nums):
        if not nums:
            return False
        s = set(nums)
        if len(s) != len(nums):
            return True
        return False

    def containsDuplicate(self, nums):
        dic = {}
        for n in nums:
            if str(n) in dic:
                return True
            dic[str(n)] = n
        return False  
        
