class Solution {
    public int subsetXORSum(int[] nums) {
        //call to recursive function
        return xorRecursive(nums, 0, 0);
    }

    private int xorRecursive(int[] nums, int index, int total) {
        //if at end of the length, you have reached the end of the game-tree, so return the running total
        if (index == nums.length) return total;

        //for computations of inclusive tree
        int newTotal = total ^ nums[index];

        //return (include) + (disclude) subtrees
        return xorRecursive(nums, index+1, newTotal) + xorRecursive(nums, index+1, total);
    }
}