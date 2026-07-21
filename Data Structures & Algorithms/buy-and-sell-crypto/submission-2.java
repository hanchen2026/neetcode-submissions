class Solution {
    public int maxProfit(int[] prices) {
        int l = prices[0];      //anchor for left sliding window
        int maxProfit = 0;      //current max sell value

        for (int i = 1; i < prices.length; i++) {
            int delta = prices[i] - l;        
            if (delta > maxProfit) maxProfit = delta;   //new highest profit
            else if (l > prices[i]) l = prices[i];      //new lowest buying potential
        }

        return maxProfit;

    }
}
