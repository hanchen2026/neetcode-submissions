class Solution {
    public boolean validPalindrome(String s) {
        int rem = 1;
        int l = 0;
        int r = s.length() - 1;

        while (l <= r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            }
            else if (rem == 1) {
                rem = 0;
                if ((verify(s, l, r-1) || (verify(s, l+1, r))) == false) return false;
                else return true;
            }
        }


        return true;
    }

    private boolean verify(String s, int l, int r) {
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }

        return true;
    }
}