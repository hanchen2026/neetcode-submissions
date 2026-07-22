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
                System.out.println("asdasd");
                k++;
                if (i != l+1) {
                    System.out.println("asdasdasdkjahsd");
                    int temp = nums[l+1];
                    nums[l+1] = nums[i];
                    nums[i] = temp;
                }
                l++;
            }
            else if (nums[i] == -111) {
                System.out.println("dasdasd");
            }
            else {
                System.out.println("zxczxczxc");
                nums[i] = -111;
            }
        }

        return k;
    }
}