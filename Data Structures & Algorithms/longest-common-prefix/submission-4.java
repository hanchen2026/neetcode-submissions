class Solution {
    public String longestCommonPrefix(String[] strs) {
        //quick exit only string
        if (strs.length == 1) return strs[0];

        //single comparator for string
        String pfix = "";
        int idx = 0;

        //while the prefix is less than the current first word
        while (pfix.length() < strs[0].length()) {
            boolean same = true;

            //loop through the rest of the words, with the remaining iterator
            for (int i = 1; i < strs.length; i++) {
                if (strs[i] == "" || strs[i].length() <= 0) return "";      //if empty string is enocountered, return "".
                else if (pfix.length() >= strs[i].length()) return pfix;    //if the first string is longer than some later string, return current prefix
                if (strs[0].charAt(idx) != strs[i].charAt(idx)) same = false;   //character mismatch, false.
            }

            //if all same add, increase index comparator, else return current prefix.
            if (same) {
                pfix += strs[0].charAt(idx);
                idx++;
            } 
            else break;
        }

        return pfix;
    }
}