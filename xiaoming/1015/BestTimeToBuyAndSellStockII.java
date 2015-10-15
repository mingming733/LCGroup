
public class BestTimeToBuyAndSellStockII {
	
	public int maxProfit(int[] prices) {
        
        if (prices == null || prices.length <= 1) return 0;
        int res = 0;
        boolean buy = true;
        for (int i = 0; i < prices.length - 1 ; i++) {
            if (prices[i+1] > prices[i] && buy) {
                res -= prices[i];
                buy = false;
                continue;
            }
            if (prices[i+1] < prices[i] && !buy) {
                res += prices[i];
                buy = true;
            }
        }
        if( !buy ) res += prices[prices.length - 1]; 
        return res;
    }

}
