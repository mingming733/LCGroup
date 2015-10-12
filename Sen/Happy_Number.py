class Solution:
    # @param {integer} n
    # @return {boolean}
    def isHappy(self, n): 
        m = n
        mem = set()
        while m not in mem:
            mem.add(m)
            m = sum([int(x) ** 2 for x in str(m)]) 
            if m == 1:
                return True
        return False

    # def isHappy(self, n): # wrong, endless  
    #     if n == 1:
    #         return True
    #     lst = []
    #     while n >= 1:
    #         lst.append(n % 10)
    #         n = n / 10
    #     sum = 0
    #     for item in lst:
    #         sum += item * item
    #     return self.isHappy(sum)

n = 19
i = Solution()
print i.isHappy(n)