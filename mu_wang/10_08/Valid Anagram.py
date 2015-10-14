Valid Anagram.py·
class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        return [ x for x in sorted(s)]==[x for x in sorted(t)]