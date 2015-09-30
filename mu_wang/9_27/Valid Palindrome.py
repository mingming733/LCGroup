class Solution(object):
    # Time exceed 
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        a = ""
        b = ""
        for i in s:
            if i.isalnum():
                a = a+i
                b += i
        return a==b



class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        a = []
        for i in s:
            if i.isalnum():
                a.append(i.lower())
        return a[::-1]==a


a = Solution()
print a.isPalindrome("aba")