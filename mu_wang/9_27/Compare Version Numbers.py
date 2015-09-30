class Solution(object):
    def compareVersion(self, version1, version2):
        """
        :type version1: str
        :type version2: str
        :rtype: int
        """
        # if ("." not in version1) and ("." not in version2):
        #     if int(version1)>int(version2):
        #         return 1
        #     if int(version1) <int(version2):
        #         return -1
        #     else:
        #         return 0
        a = version1.split(".")
        b = version2.split(".")

        i =0
        while i< min(len(a),len(b)):
        
            if int(a[i])>int(b[i]):
                return 1
            if int(a[i])<int(b[i]):
                return -1
            i+=1
        if len(a)==len(b):
            return 0
        if len(a)>len(b):
            while i<len(a):
                if int(a[i])!=0:
                    return 1
                i+=1
            return 0
        if len(a)<len(b):
            while i<len(b):
                if int(b[i])!=0:
                    return -1
                i+=1
            return 0

a = Solution()
print a.compareVersion('1.0',"1")