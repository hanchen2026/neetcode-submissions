class Solution {
    public int maxSubArray(int[] nums) {
        //initialize max and cur pointers
        int maxSum = nums[0];
        int curSum = maxSum;

        //kadane's algo.
        for (int i = 1; i < nums.length; i++) { 
            if (curSum + nums[i] < nums[i]) curSum = nums[i];           //if the sum of the new and old subset LESS than raw new value, reset.
            else curSum += nums[i];                                     //else append

            if (curSum > maxSum) maxSum = curSum;                       //assign at end of each loop
        }

        return maxSum;
    }
}
