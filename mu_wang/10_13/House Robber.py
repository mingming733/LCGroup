class Solution(object):
    def rob(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        last, now = 0, 0

        for i in nums: last, now = now, max(last + i, now)

        return now

    def rob(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        a = 0
        b = 0
        for idx,i in enumerate(nums):
            if idx % 2==0:
                a = max(a+i,b)
            else:
                b = max(b+i,a)
        return max(a,b)