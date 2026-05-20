class Solution {
    public int missingNumber(int[] nums) {
        // start with 0
        int start = 0;
        
        // xor numbers from 0 to n. Useful later for bitwise operations
        for (int i = 1; i <= nums.length; i++) {
            start ^= i;
        }

        // xor numbers in the nums array. 
        int startArr = nums[0];
        for (int i = 1; i < nums.length; i++) {
            startArr ^= nums[i];
        }

        return start ^ startArr;
    }
}
