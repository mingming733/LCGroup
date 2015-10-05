class Solution(object):
    def compareVersion(self, version1, version2):
        """
        :type version1: str
        :type version2: str
        :rtype: int
        """
        v1 = version1.split(".")
        v2 = version2.split(".")
        print v1, v2 
        len1 = len(v1)
        len2 = len(v2)
        lenMax = max(len1, len2)
        for i in range(lenMax):
            v1Token, v2Token = 0, 0
            if i < len1:
                v1Token = int(v1[i])
            if i < len2:
                v2Token = int(v2[i])
            if v1Token < v2Token:
                return -1
            if v1Token > v2Token:
                return 1
        return 0 

version1 = "2.2.2"
version2 = "2.2.2"
i = Solution()
print i.compareVersion(version1, version2)