class Solution {
    public String addBinary(String a, String b) {
        //a string causes O(N^2) runtime. Stringbuilder then reversing is O(N).
        StringBuilder result = new StringBuilder();

        int r = b.length() - 1;
        int l = a.length() - 1;
        boolean carry = false;

        while (l >= 0 && r >= 0) {
            if (a.charAt(l) != b.charAt(r)) {
                if (carry != true) result.append('1');
                else result.append('0');
            }
            else if (a.charAt(l) == '0') {
                if (carry != true) result.append('0');
                else {
                    result.append('1');
                    carry = false;
                }
            }
            else {
                if (carry != true) result.append('0');
                else result.append('1');
                carry = true;
            }

            l--;
            r--;
        }

        while (l >= 0) {
            if (carry == true) {
                if (a.charAt(l) == '0') {
                    result.append('1');
                    carry = false;
                }
                else result.append('0');
            }
            else result.append(a.charAt(l));
            l--;
        }

        while (r >= 0) {
            if (carry == true) {
                if (b.charAt(r) == '0') {
                    result.append('1');
                    carry = false;
                }
                else result.append('0');
            }
            else result.append(b.charAt(r));
            r--;
        }

        if (carry) result.append('1');

        //reverse, as you are adding to the END of the string, (L to R)
        //but adding goes from right to left
        return result.reverse().toString();
    }
}