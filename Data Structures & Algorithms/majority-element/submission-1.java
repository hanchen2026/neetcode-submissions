class Solution {
    public int majorityElement(int[] nums) {

        //initialize a counter and the potential candidate (default -1)
        int count = 0;
        int candidate = -1;

        //loop through array
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {       //if the count is zero, set the next instance of a number as the majority candidate
                candidate = nums[i];
                count++;
            }
            else {                  //if count isn't zero, then check if the number currently is the same as the candidate
                if (nums[i] != candidate) {
                    count--;        //if not, decrease count. This is so that if count decreases to 0, you change the candidate.
                }
                else {
                    count++;        //increment count otherwise. Majority element cant be changed.
                }
            }
        }

        return candidate;           //return candidate
    }
}