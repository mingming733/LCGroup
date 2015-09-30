class Solution(object):
    def countAndSay(self, n):
        """
        :type n: int
        :rtype: str
        """
        s = '1'
        for i in range(2, n + 1):
        	s = self.count(s)
        return s 

    def count(self,s):
        t = ''; count = 0; curr = '#'
        for i in s: 
            if i != curr: 
                if curr != '#': # only run when a new number accurs 
                    t += str(count) + curr
                curr = i # these blocks run every time 
                count = 1
            else: # check if there are the same number continuously 
                count += 1 
        t += str(count) + curr
        return t
n = 6
i = Solution()
print i.countAndSay(n)