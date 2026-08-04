class Solution {
    public int[] productExceptSelf(int[] nums) {
        //return array, but on first pass acts as a "prefix" array
        int[] ret = new int[nums.length];

        //fill in ret with prefix (exclusive)
        for (int i = 0; i < ret.length; i++) {
            if (i == 0) ret[i] = 1;
            else ret[i] = ret[i-1] * nums[i-1];
        }

        // integer counter that accumulates as a running suffix
        int suffix = 1;

        //in reverse order, multiply and accumulate suffix values
        for (int i = ret.length - 1; i >=0 ; i--) {
            ret[i] = ret[i] * suffix;
            suffix = suffix * nums[i];
        }

        return ret;
    }
}  
