class Solution {
    public int removeDuplicates(int[] nums) {
        //early return condition
        if (nums.length == 1) return 1; 

        //setting up two pointers
        int l = 0;
        int k = 1;

        for(int i = 1; i < nums.length; i++) {
            //distinct so if directly next do nothing 
            if (nums[i] > nums[l]) {
                k++;                //new value increase k
                if (i != l+1) {     //not directly next so swap the adjacent L pointer with the current i-pointer
                    int temp = nums[l+1];
                    nums[l+1] = nums[i];
                    nums[i] = temp;
                }
                l++;                //increment L
            }
            //else it is a duplicate, so do nothing and just move to the right via the loop's i pointer.
        }

        return k;
    }
}