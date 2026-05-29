class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];

        String pfix = "";
        int idx = 0;

        while (pfix.length() < strs[0].length()) {
            boolean same = true;

            for (int i = 1; i < strs.length; i++) {
                if (strs[i] == "" || strs[i].length() <= 0) return "";
                else if (pfix.length() >= strs[i].length()) return pfix;
                if (strs[0].charAt(idx) != strs[i].charAt(idx)) same = false;
            }


            if (same) {
                pfix += strs[0].charAt(idx);
                idx++;
            } 
            else break;
        }

        return pfix;
    }
}