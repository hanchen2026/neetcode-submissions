class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r-l)/2;

            //handles the case where the index exists in range
            if (nums[mid] == target) return mid;
            
            //left right delta is 1, and does not fit either
            else if (r-l == 1 && (nums[l] < target && nums[r] > target)) return l+1;

            else if (nums[mid] < target) {
                l = mid+1;
            }
            else {
                r = mid-1;
            }

        }

        //maybe??
        System.out.println("hi");
        return l;
    }
}