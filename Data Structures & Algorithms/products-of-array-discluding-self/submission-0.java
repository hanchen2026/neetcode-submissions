class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ret = new int[nums.length];

        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];


        for (int i = 0; i < prefix.length; i++) {
            if (i == 0) prefix[i] = 1;
            else {
                prefix[i] = prefix[i-1] * nums[i-1];
            }
        }

        for (int i = suffix.length - 1; i >= 0; i--) {
            if (i == suffix.length - 1) suffix[i] = 1;
            else {
                suffix[i] = suffix[i + 1] * nums[i + 1];
            }
            System.out.println(suffix[i]);
        }

        for (int i = 0; i < ret.length; i++) {
            ret[i] = prefix[i] * suffix[i];
        }

        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(suffix));
        System.out.println(Arrays.toString(ret));


        return ret;
    }
}  
