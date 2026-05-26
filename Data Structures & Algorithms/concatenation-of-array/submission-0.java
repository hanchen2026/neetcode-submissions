class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] concat = new int[nums.length*2];

        for(int i = 0; i < nums.length*2; i++) { 
            if (i < nums.length) {
                concat[i] = nums[i];
            }
            else {
                concat[i] = nums[i - (nums.length)];
            }  
        }
        
        return concat;
    }
}