class Solution {
    public int longestConsecutive(int[] nums) {
        //max for longest consecutive; HashSet for O(1) lookup
        int max = 0;
        HashSet<Integer> set = new HashSet<>();

        //populate hashset with integers from the array
        for (int n: nums) set.add(n);

        //algorithm for thingy
        for (Integer key: set) {
            int window = 1;     //inclusive; so start at 1.

            //  if a previous value exists, 
            //  skip this number and go on to next in hashset.
            if (set.contains(key-1)) continue;   

            //go until doesnt exist.
            while(true) {
                if (!set.contains(key+1)) break;
                window++;
                key++;
            }

            //assign new max if greater
            if (window > max) max = window;
        }


        return max;
    }
}
