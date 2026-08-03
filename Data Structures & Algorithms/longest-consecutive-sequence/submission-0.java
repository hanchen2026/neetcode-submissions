class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        HashSet<Integer> set = new HashSet<>();

        //populate hashset with integers from the array
        for (int n: nums) {
            set.add(n);
        }

        //algorithm for thingy
        for (Integer key: set) {
            int window = 1;
            if (set.contains(key-1)) continue;
            while(true) {
                if (!set.contains(key+1)) break;
                window++;
                key++;
            }
            if (window > max) max = window;
        }


        return max;
    }
}
