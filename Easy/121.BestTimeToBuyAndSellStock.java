class Solution {
    public int maxProfit(int[] prices) {
        int minSell = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i]<minSell) minSell = prices[i];
            else maxProfit = (prices[i]-minSell < maxProfit)? maxProfit : prices[i]-minSell;
        }
        return maxProfit;
    }
}