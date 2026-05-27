class Solution {
    public int removeElement(int[] nums, int val) {
        int lastPtr = nums.length-1;
        int rem = 0;

        for (int i = 0; i < nums.length; i++) {
            if (lastPtr < i) break;

            if (nums[i] == val) {
                while(nums[lastPtr] == val) {
                    if (lastPtr <= i) break;
                    lastPtr--;
                }

                //swap
                if (i != lastPtr) {
                    int temp = nums[i];
                    nums[i] = nums[lastPtr];
                    nums[lastPtr] = temp;
                    rem++;
                }
            }
            else {
                rem++;
            }
        }

        return rem;
        
    }
}