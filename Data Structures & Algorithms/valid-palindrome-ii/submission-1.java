class Solution {
    public boolean validPalindrome(String s) {
        int rem = 1;
        int l = 0;
        int r = s.length() - 1;
        

        while (l <= r) {
            System.out.println("L: " + l + "\nR: " + r + "\nRem: " + rem);
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
                System.out.println("here1");
            }
            else if (rem == 1) {
                rem = 0;
                if ((verify(s, l, r-1) || (verify(s, l+1, r))) == false) return false;
                else return true;
                // l++;
                // r--;
                // a = s.charAt(l);
                // b = s.charAt(r);
                // System.out.println("here2");
            }
        }


        return true;
    }

    private boolean verify(String s, int l, int r) {
        System.out.println("In verify" + "\nL: " + l + "\nR: " + r);
        while (l <= r) {
            System.out.println("asdasdsad" + "\nL: " + l + "\nR: " + r);
            System.out.println("asdasdsad" + "\nL: " + l + "\nR: " + r);
            if (s.charAt(l) != s.charAt(r)) {
                System.out.println("faslkdjaskzjdhkahjsdfhgaikusdhcauisyhkjmgfauiyjhkdjyj hdbwu2yqgej");
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}