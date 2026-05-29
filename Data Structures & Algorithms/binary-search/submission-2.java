class Solution {
    public int search(int[] nums, int target) {
        int idx = -1;

        int l = 0;
        int r = nums.length - 1;

        System.out.println("Target: " + target);

        while (l <= r) {
            int mid = (r+l)/2;
            System.out.println("Mid: " + mid);
            System.out.println("Value: " + nums[mid]);


            if (target > nums[mid]) {
                System.out.println("L " + l);
                l = mid+1;
            }
            else if (target < nums[mid]) {
                System.out.println("R " + r);
                r = mid-1;
            }
            else {
                System.out.println("Target Found. ");
                return mid;  
            }

        }

        return -1;
    }
}
