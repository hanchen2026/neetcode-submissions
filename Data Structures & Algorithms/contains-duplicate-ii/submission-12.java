class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //edge case catching
        if (k == 0 || nums.length <= 1) return false;

        //start initial window
        HashSet<Integer> window = new HashSet<>();
        int len = Math.min(k, nums.length-1);
        
        for (int i = 0 ; i <= len; i++) {                 //go up until the window size (k, inclusive)
            if(window.contains(nums[i])) return true;   //if in set early return
            window.add(nums[i]);
        }

        //sliding window operations
        for(int i = k+1; i < nums.length; i++) {
            window.remove(nums[i-k-1]);                 //remove the 0-th window element (k+1-k-1) = 0
            if(window.contains(nums[i])) return true;   //if element to be added is in set then return true
            window.add(nums[i]);                        //else extend window
        }

        return false;
    }
}