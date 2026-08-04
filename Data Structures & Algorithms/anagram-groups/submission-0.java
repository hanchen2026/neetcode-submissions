class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ret = new ArrayList<>();        
        HashMap<String, Integer> map = new HashMap<>();
        int counter = 0;

        for (int i = 0; i < strs.length; i++) {
            System.out.println(i);

            String str = strs[i];

            char[] arr = str.toCharArray();

            Arrays.sort(arr);

            String result = new String(arr);

            if (!map.containsKey(result)) {
                List<String> lst = new ArrayList<>();
                lst.add(strs[i]);
                map.put(result, counter);
                counter++;
                ret.add(lst);
            }
            else {
                int index = map.get(result);
                ret.get(index).add(strs[i]);
            }

        }
        
        return ret;
    }
}
