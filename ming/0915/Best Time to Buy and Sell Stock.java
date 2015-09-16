public class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len < 2){
            return 0;
        }
        int min = prices[0];
        int maxProf = Integer.MIN_VALUE;
        int[] profit = new int[len];
        
        for (int i = 1; i < len; i++){
            min = Math.min(min, prices[i]);
            profit[i] = prices[i] - min;
            maxProf = Math.max(maxProf, profit[i]);
        }
        return maxProf;
    }
}