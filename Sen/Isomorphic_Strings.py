class Solution(object):
    # def isIsomorphic(self, s, t):
    #     """
    #     :type s: str
    #     :type t: str
    #     :rtype: bool
    #     """
    #     sourceMap, targetMap = dict(), dict() # symmetrical 
    #     for i in range(len(s)):
    #         source, target = sourceMap.get(t[i]), targetMap.get(s[i])
    #         if source is None and target is None:
    #             sourceMap[t[i]], targetMap[s[i]] = s[i], t[i]
    #         elif source != s[i] or target != t[i]:
    #             return False
    #     return True

    def isIsomorphic(self, s, t):
        if not s or not t or len(s) != len(t):
            return False
        map = dict()
        for i in range(len(s)):
            if s[i] in map:
                if map[s[i]] != t[i]:
                    return False
            else:
                if t[i] in map.values():
                    return False
                map[s[i]] = t[i]

        return True

s, t = "eggf", "foof"
i = Solution()
print i.isIsomorphic(s, t)