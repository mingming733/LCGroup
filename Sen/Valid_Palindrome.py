class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        if not s:
            return True
        s = s.lower()
        map = set("abcdefghijklmnopqrstuvwxyz0123456789")
        n = len(s)
        i, j = 0, n - 1
        while i < j:
            if s[i] in map and s[j] in map:
                if s[i] != s[j]:
                    return False
                else:
                    i += 1
                    j -= 1
            elif s[i] not in map:
                i += 1
            elif s[j] not in map:
                j -= 1
        return True 

    def isPalindrome(self, s):
    	s = [x for x in s.lower() if x.isalnum()] # "s.isalnum" return boolean if the string is alphanumeric 
    	return s == s[:: -1]