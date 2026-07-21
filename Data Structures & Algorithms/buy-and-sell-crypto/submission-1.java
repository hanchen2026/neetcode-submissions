class Solution {
    public int maxProfit(int[] prices) {
        int l = prices[0];      //anchor for left sliding window
        int maxProfit = 0;      //current max sell value

        for (int i = 1; i < prices.length; i++) {
            int delta = prices[i] - l;        //sale value must be positive
            if(prices[i] > l) {                 
                if (delta > maxProfit) {
                    maxProfit = delta;
                }
            }
            else l = prices[i];
        }
        
        return maxProfit;

    }
}
