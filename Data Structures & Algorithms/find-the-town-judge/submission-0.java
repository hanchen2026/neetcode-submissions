class Solution {
    public int findJudge(int n, int[][] trust) {
        Hashtable<Integer, Integer> town = new Hashtable<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < trust.length; i++) {
            if (town.containsKey(trust[i][1])) {
                town.put(trust[i][1], town.get(trust[i][1]) + 1);
            }
            else {
                town.put(trust[i][1], 1);
                set.add(trust[i][0]);
            }
        }

        for(Integer key: town.keySet()) {
            if (town.get(key) == n-1 && !set.contains(key)) return key;
        }

        return -1;
    }
}