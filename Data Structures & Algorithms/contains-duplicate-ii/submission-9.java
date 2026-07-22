class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0 || nums.length <= 1) return false;

        //start initial window
        HashSet<Integer> window = new HashSet<>();
        for (int i = 0 ; i <= k; i++) {
            System.out.println("for1");
            if(window.contains(nums[i])) return true;
            window.add(nums[i]);
        }

        //sliding window operations
        for(int i = k+1; i < nums.length; i++) {
            System.out.println("for2");
            window.remove(nums[i-k-1]);
            if(window.contains(nums[i])) return true;
            window.add(nums[i]);
        }

        return false;
    }
}