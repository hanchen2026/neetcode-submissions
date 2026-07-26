class Solution {
    public int subsetXORSum(int[] nums) {
        return xorRecursive(nums, 0, 0);
    }

    private int xorRecursive(int[] nums, int index, int total) {
        if (index == nums.length) return total;
        int newTotal = total ^ nums[index];
        return xorRecursive(nums, index+1, newTotal) + xorRecursive(nums, index+1, total);
    }
}