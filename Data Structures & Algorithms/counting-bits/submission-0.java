class Solution {
    public int[] countBits(int n) {
        int[] ret = new int[n+1];

        for(int i = 0; i < ret.length; i++) {
            if (i == 0) {
                ret[i] = 0;
            }
            else {
                ret[i] = (i % 2) + ret[i/2];
            }
        }

        return ret;
    }
}
