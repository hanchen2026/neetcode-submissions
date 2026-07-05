class Solution {
    public boolean validPalindrome(String s) {
        //instantiate a left and right pointer
        int l = 0;
        int r = s.length() - 1;

        while (l <= r) {
            if (s.charAt(l) == s.charAt(r)) {       //valid so proceed as usual
                l++;
                r--;
            }
            else break;
        }

        if ((verify(s, l, r-1) || (verify(s, l+1, r))) == false) return false;
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