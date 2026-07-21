class Solution {
    public int maxProfit(int[] prices) {
        int l = prices[0];
        int val = 0;

        for (int i = 1; i < prices.length; i++) {
            int newDiff = prices[i] - l;
            if(prices[i] > l) {
                if (newDiff > val) {
                    val = newDiff;
                }
            }
            else l = prices[i];
        }
        
        return val;

    }
}