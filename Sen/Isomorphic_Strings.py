class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        sourceMap, targetMap = dict(), dict() # symmetrical 
        for i in range(len(s)):
            source, target = sourceMap.get(t[i]), targetMap.get(s[i])
            if source is None and target is None:
                sourceMap[t[i]], targetMap[s[i]] = s[i], t[i]
            elif source != s[i] or target != t[i]:
                return False
        return True

s, t = "egg", "foo"
i = Solution()
print i.isIsomorphic(s, t)