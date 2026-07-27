class Solution {
    public int climbStairs(int n) {
        int prev = 0;
        int next = 1;

        for (int i = 0; i < n; i++) {
            int temp = next;
            next += prev;
            prev = temp;
        }

        return next;
    }
}
