class Solution {
    public String convertToTitle(int columnNumber) {
        String ret = "";
        while (columnNumber > 0) {
            // 1 based indexing, so 0-25 -> 1-26; 
            columnNumber--;         //minus 1 to get to zero based indexing
            int rem = columnNumber % 26;
            char c = (char) ('A' + (char)rem);
            ret = c + ret;
            columnNumber /= 26;
        }   

        return ret;
    }
}