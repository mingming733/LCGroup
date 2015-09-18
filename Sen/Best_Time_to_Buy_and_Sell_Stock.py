class Solution(object):
    def maxProfit(self, prices): # Kadane's algorithm 
        """
        :type prices: List[int]
        :rtype: int
        """
        maxCur, maxSofar = 0, 0
        for i in range(1, len(prices)):
        	maxCur += prices[i] - prices[i - 1] # calculate the difference of the original array
        	maxCur = max(0, maxCur) # if maxCur < 0, set it to 0
        	maxSofar = max(maxCur, maxSofar)
        return maxSofar

prices = [6, 1, 4, 9]
i = Solution()
print i.maxProfit(prices)

