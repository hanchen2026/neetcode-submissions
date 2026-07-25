class Solution {
    public int findJudge(int n, int[][] trust) {
        //fuck you neetcode for putting this under hashtables its not even efficient
        //just use a single int[n+1] array. Easier. Use net trust. The index with 
        //a value of n-1 net trust is the solution.
        
        Hashtable<Integer, Integer> town = new Hashtable<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < trust.length; i++) {
            if (town.containsKey(trust[i][1])) {
                town.put(trust[i][1], town.get(trust[i][1]) + 1);
            }
            else {
                town.put(trust[i][1], 1);
            }
            set.add(trust[i][0]);
        }

        for(Integer key: town.keySet()) {
            if (town.get(key) == n-1 && !set.contains(key)) return key;
        }

        return -1;
    }
}