class Solution {
    public String mergeAlternately(String word1, String word2) {
        int p1 = 0;
        int p2 = 0;
        String merged = "";

        while (p1 <= word1.length() - 1) {
            merged += word1.charAt(p1);
            if (p2 <= word2.length() - 1) {
                merged += word2.charAt(p2);
                p2++;
            }
            p1++;
        }

        while (p2 <= word2.length() - 1) {
            merged += word2.charAt(p2);
            p2++;
        }

        return merged;
        
    }
}