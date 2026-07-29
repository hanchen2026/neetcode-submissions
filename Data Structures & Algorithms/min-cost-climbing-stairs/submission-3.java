class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //tabulation dp array (also assumes first two is 0, as you can start there)
        int[] sol = new int[cost.length + 1];
        
        for(int i = 2; i < sol.length; i++) {
            //only do min from potential possible paths (current sol at i-1, plus the cost at i-1, similar to i-2)
            sol[i] = Math.min((sol[i-1] + cost[i-1]), sol[i - 2] + cost[i - 2]);
        }

        return sol[cost.length];
    }
}
