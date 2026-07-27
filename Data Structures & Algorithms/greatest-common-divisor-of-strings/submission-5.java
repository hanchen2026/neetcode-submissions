class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // initial gcd calcs O(log(n) time)
        int a = str1.length();
        int b = str2.length();
        int gcd = gcd(a, b);

        // assert greatest gcd substring
        String ret = str1.substring(0, gcd);

        //O(N) final check for both strings for consistency with gcd substring
        for(int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != (ret.charAt( (i % ret.length()) ))) return "";
        }
        for(int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) != (ret.charAt( (i % ret.length()) ))) return "";
        }

        return ret;
    }

    private int gcd(int a, int b){
        int bigger = (a > b) ? a : b;
        int result = (a == bigger) ? b : a;
        while (result > 0) {
            int temp = (bigger % result);
            bigger = result;
            if (temp == 0) {
                break;
            }
            result = temp;
        }

        return result;
    }
}