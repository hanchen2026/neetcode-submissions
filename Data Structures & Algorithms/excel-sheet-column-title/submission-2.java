class Solution {
    public String convertToTitle(int columnNumber) {
        String ret = "";

        // <= 0 determines when no more leading values
        while (columnNumber > 0) {

            // 1 based indexing, so 0-25 -> 1-26; 
            columnNumber--;         //minus 1 to get to zero based indexing
            char rem = (char) (columnNumber % 26);
            char c = (char) ('A' + rem);        //'A' + 0-indexed remainder = actual remainder
            ret = c + ret;                      //append values to FRONT of current string
            columnNumber /= 26;                 //next digit by /26.
        }   

        return ret;
    }
}