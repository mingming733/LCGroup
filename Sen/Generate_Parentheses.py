class Solution(object):
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        if n == 0:
            return []
        res = []
        self.helpler(n, n, '', res)
        return res

    def helpler(self, l, r, item, res):
        if r < l:
            return
        if l == 0 and r == 0:
            res.append(item)
        if l > 0:
            self.helpler(l - 1, r, item + '(', res)
        if r > 0:
            self.helpler(l, r - 1, item + ')', res)

    # def generateParenthesis(self, n):
    #     if not n:
    #         return []
    #     if n == 1:
    #         return ["()"]
    #     rst = []
    #     base1 = "()" * (n - 1)
    #     base2 = "(" * (n - 1) + ")" * (n - 1)
    #     s = set()
    #     for i in range(n):
    #         s.add("(" + base1[:i] + ")" + base1[i:])
    #     for i in range(n):
    #         s.add("(" + base2[:i] + ")" + base2[i:])
    #     return list(s)
        


n = 3
i = Solution()
print i.generateParenthesis(n)