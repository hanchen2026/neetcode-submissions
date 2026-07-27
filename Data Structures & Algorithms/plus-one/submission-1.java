class Solution {
    public int[] plusOne(int[] digits) {
        long num = 0;
        int newlen = 0;

        for (int i = 0; i < digits.length; i++) {
            num = (num*10) + digits[i];
        }
        num++;
        long numcpy = num;

        while(numcpy > 0) {
            numcpy /= 10;
            newlen++;
        }

        int[] ret = new int[newlen];
        for(int i = ret.length-1; i >= 0; i--) {
            ret[i] = (int) (num % 10);
            num /= 10;
        }

        return ret;
    }
}
