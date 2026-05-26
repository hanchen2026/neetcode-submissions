class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map1.merge(s.charAt(i), 1, Integer::sum);
        }

        for (int i = 0; i < s.length(); i++) {
            map2.merge(t.charAt(i), 1, Integer::sum);
        }

        if (map1.equals(map2)) return true;
        return false;
    }
}
