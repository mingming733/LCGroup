class Solution(object):
    def wordPattern(self, pattern, str):
        """
        :type pattern: str
        :type str: str
        :rtype: bool
        """
        if not pattern or not str:
            return False 
        str.strip()
        lst = str.split()
        if len(pattern) != len(lst):
            return False
        dic = dict()
        i = 0
        while i < len(pattern):
            if pattern[i] in dic:
                if dic[pattern[i]] != lst[i]:
                    return False 
            dic[pattern[i]] = lst[i]
            i += 1
        lst = dic.values()
        s = set(lst)
        return len(lst) == len(s)

pattern = "abba"
str = "dog dog dog dog"
i = Solution()
print i.wordPattern(pattern, str)
