class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        dic1, dic2 = {}, {}
        for item in s:
            dic1[item] = dic1.get(item, 0) + 1
        for item in t:
            dic2[item] = dic2.get(item, 0) + 1
        return dic1 == dic2

    # def isAnagram(self, s, t): # mine 
    #     # if not s and t: # do I need to show this two if? even I still get correct solution
    #     #     return False
    #     # if not t and s:
    #     #     return False 
            
    #     # if len(s) != len(t):
    #     #     return False 
    #     map = dict()
    #     for i in s:
    #         if i not in map:
    #             map[i] = 1
    #         else:
    #             map[i] += 1
    #     for j in t:
    #         if j not in map:
    #             return False
    #         map[j] -= 1
    #     for val in map.values():
    #         if val != 0:
    #             return False
    #     return True 
        
s = "anagram"
t = "nagaram"
# s = ""
# t = ""
i = Solution()
print i.isAnagram(s, t)