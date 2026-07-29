class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //tabulation dp array (also assumes first two is 0, as you can start there)
        int[] sol = new int[cost.length + 1];
        
        for(int i = 2; i < sol.length; i++) {
            sol[i] = Math.min((sol[i-1] + cost[i-1]), sol[i - 2] + cost[i - 2]);
            System.out.println("Solution of i: " + sol[i] + " at index : " + i);
        }

        return sol[cost.length];
    }
}
