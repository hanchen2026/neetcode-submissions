class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];

        int maxSum = nums[0];
        int curSum = maxSum;

        for (int i = 1; i < nums.length; i++) { 
            if (curSum + nums[i] < nums[i]) curSum = nums[i];
            else curSum += nums[i];

            if (curSum > maxSum) maxSum = curSum;
        }

        return maxSum;
    }
}
