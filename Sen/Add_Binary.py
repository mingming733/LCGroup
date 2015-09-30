class Solution(object):
    def addBinary(self, a, b): # iteration
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        aIndex, bIndex = len(a) - 1, len(b) - 1
        carry = 0 
        s = ""
        while aIndex >= 0 and bIndex >= 0:
        	num = int(a[aIndex]) + int(b[bIndex]) + carry
        	carry = num / 2; num %= 2
        	s = str(num) + s
        	aIndex -= 1; bIndex -= 1
        while aIndex >= 0:
        	num = int(a[aIndex]) + carry
        	carry = num / 2; num %= 2
        	s = str(num) + s
        	aIndex -= 1
        while bIndex >= 0:
        	num = int(b[bIndex]) + carry
        	carry = num / 2; num %= 2
        	s = str(num) + s
        	bIndex -= 1
        if carry == 1:
        	s = "1" + s
        return s

    def addBinary(self, a, b): # recursion
        if len(a) == 0:
        	return b 
        if len(b) == 0:
        	return a 
        if a[-1] == "1" and b[-1] == "1":
        	return self.addBinary(self.addBinary(a[0 : -1], b[0 : -1]), "1") + "0"
        if a[-1] == "0" and b[-1] == "0":
        	return self.addBinary(a[0 : -1], b[0 : -1]) + "0"
        else:
        	return self.addBinary(a[0 : -1], b[0 : -1]) + "1"
a = "11"; b = "1"
i = Solution()
print i.addBinary(a, b)