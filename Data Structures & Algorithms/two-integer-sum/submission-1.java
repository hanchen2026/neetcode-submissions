class Solution {
    public int[] twoSum(int[] nums, int target) {
        //instantiate hashmap + solution array
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] sol = new int[2];

        //fill out hashmap
        for (int i = 0; i < nums.length; i++) {

            //if the delta exists in map, return that and the current index
            if (map.containsKey(target - nums[i])) {
                sol[0] = map.get(target-nums[i]);
                sol[1] = i;
            }

            //put the current index as the value, for later reference
            map.put(nums[i], i);
        }

        return sol;
    }
}
