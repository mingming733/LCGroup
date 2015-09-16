class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        result = list()
        n = len(digits)
        num = 0
        for a in range(n):
             num+=digits[a]*(10**(n-1))
             n-=1
        num =num+1
        result = result + [ int(x) for x in str(num)]
        return result




    def plusOne_2(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        for i in range(len(digits)-1,-1,-1):
            if digits[i]!=9:
                digits[i]+=1
                return digits
            else:
                digits[i]=0
                
        digits[0]=1
        digits+=[0]
        return digits