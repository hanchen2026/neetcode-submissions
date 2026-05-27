class Solution {
    public int removeElement(int[] nums, int val) {
        //moving pointer + "k"
        int lastPtr = nums.length-1;
        int rem = 0;

        //go thourgh loop
        for (int i = 0; i < nums.length; i++) {
            if (lastPtr < i) break;     //break when pointers meet

            //if unmatched value, do logic
            if (nums[i] == val) {
                while(nums[lastPtr] == val) {       //go to leftmost non-val pointer, unless it is left of the left ptr
                    if (lastPtr <= i) break;
                    lastPtr--;
                }

                //swap only when necessary
                if (i != lastPtr) {
                    int temp = nums[i];
                    nums[i] = nums[lastPtr];
                    nums[lastPtr] = temp;
                    rem++;                      //valid swap, so increment current index
                }
            }   
            else {      //else just increment left pointer and ignore
                rem++;
            }
        }

        return rem;
        
    }
}