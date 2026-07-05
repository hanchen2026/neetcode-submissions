class Solution {
    public boolean validPalindrome(String s) {
        //instantiate a left and right pointer
        int l = 0;
        int r = s.length() - 1;

        //normal check for palindrome
        while (l <= r) {
            if (s.charAt(l) == s.charAt(r)) {       //valid so proceed as usual
                l++;
                r--;
            }
            else break;                             //at least one mismatch, break and perform secondary check
        }

        if (l <= r) {                               //skipped if palindrome
            if ((verify(s, l, r-1) || (verify(s, l+1, r))) == false) return false;          //if either is not palindrome return false
        }
        return true;
    }

    //helper for palindrome checking
    private boolean verify(String s, int l, int r) {
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }

        return true;
    }
}