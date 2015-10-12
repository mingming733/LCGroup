Longest Common Prefix.py
class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        prefix = ""
        for i in zip(*strs):
            bog = set(i)
            if len(bog)==1:
                prefix+=bog.pop()
            else:
                break
        return prefix
        