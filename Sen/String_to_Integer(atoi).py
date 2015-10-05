class Solution(object):
    def myAtoi(self, str):
        """
        :type str: str
        :rtype: int
        """
        if not str:
            return 0
        str = str.strip()
        rst = ""
        minusCnt = 0
        sign = ""
        for n in str:
            if n in "-":
                 minusCnt += 1
            if n.isdigit():
                rst += n
        if not len(rst):
            return 0
        else:
            if minusCnt % 2 != 0:
                sign = "-"
            return int(sign + rst)

str = "+-1"
i = Solution()
print i.myAtoi(str)