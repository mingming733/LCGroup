class Solution(object):
    def hammingWeight(self, n):
        """
        :type n: int
        :rtype: int
        """
        count =0
        for i in xrange(2,len(str(bin(n)))):
            if str(bin(n))[i]=="1":
                count+=1
        
        return count