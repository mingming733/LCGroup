class Solution(object):
    def convert(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        if numRows == 1:
        	return s
        period = 2 * (numRows - 1) # calculate the period 
        lines = ["" for i in range(numRows)] # how many lines
        d = {}
        for i in range(period):
        	if i < numRows:
        		d[i] = i
        	else:
        		d[i] = period - i 
        for i in range(len(s)):
        	lines[d[i % period]] += s[i]
        return "".join(lines)

s = "PAYPALISHIRING"
numRows = 4
i = Solution()
print i.convert(s, numRows)