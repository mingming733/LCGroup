class Solution(object):
    def addDigits(self, num):
        """
        :type num: int
        :rtype: int
        """
        while num > 9:
            num = sum([int(item) for item in str(num)])
        return num