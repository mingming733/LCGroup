class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        if len(prices)<1:
            return 0
        min_p = prices[0]
        profit = 0
        for i in range(0,len(prices)):
            min_p = min(min_p,prices[i])
            cha = prices[i]-min_p
            profit = max(cha,profit)
        
        return profit

a = Solution()
print a.maxProfit([1,2,1,5,4])