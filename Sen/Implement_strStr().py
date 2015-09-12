class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        haystackPtr = 0
        while True:
        	needlePtr = 0
        	while True:
        		if needlePtr == len(needle): # check if needle is empty  
        			return haystackPtr
        		if haystackPtr + needlePtr == len(haystack):
        			return -1
        		if needle[needlePtr] != haystack[haystackPtr + needlePtr]:
        			break 
        		needlePtr += 1
        	haystackPtr += 1