class Solution {
    public int[] plusOne(int[] digits) {
        boolean all9 = true;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                all9 = false;
                break;
            }
            else {
                digits[i] = 0;
            }
        }

        if(all9) {
            int newlen = digits.length + 1;
            digits = new int[newlen];
            digits[0] = 1;

            for(int i = 1; i < digits.length; i++) {
                digits[i] = 0;
            }
        }

        return digits;
    }
}
