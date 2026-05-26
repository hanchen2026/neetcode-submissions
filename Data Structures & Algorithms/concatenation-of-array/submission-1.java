class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] concat = new int[nums.length*2];

        for(int i = 0; i < nums.length*2; i++) { 
            concat[i] = (i < nums.length) ? nums[i] : nums[i - (nums.length)];
        }
        
        return concat;
    }
}