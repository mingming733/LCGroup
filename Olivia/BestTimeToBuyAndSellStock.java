public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length<=0||prices==null){
            return 0;
        }
        int min=Integer.MAX_VALUE,profit=0;//min need the smallest one
        for(int i:prices){
            min=Math.min(i,min);
            profit=Math.max(i-min,profit);
        } 
        return profit;
    }
}