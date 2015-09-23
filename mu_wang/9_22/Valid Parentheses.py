class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        if len(s)<2:
            return False
        sample = {'}':'{',')':'(',']':'['}
        result = list()
        
        for single in s:
            if single in sample.values():
                result.append(single)
            else:
                if len(result)<1:
                    return False
                if result.pop()!=sample[single]:
                    return False
        if len(result)>0:
            return False
        return True