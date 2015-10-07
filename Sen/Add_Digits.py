class Solution(object):
    def addDigits(self, num):
        """
        :type num: int
        :rtype: int
        """
        if num < 10:
            return num
        while num > 9:
            num = sum([int(item) for item in str(num)])
        return num