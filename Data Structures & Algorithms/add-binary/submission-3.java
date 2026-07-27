class Solution {
    public String addBinary(String a, String b) {
        String result = "";

        int r = b.length() - 1;
        int l = a.length() - 1;
        boolean carry = false;

        while (l >= 0 && r >= 0) {
            if (a.charAt(l) != b.charAt(r)) {
                if (carry != true) result = '1' + result;
                else {
                    result = '0' + result;
                }
            }
            else if (a.charAt(l) == '0') {
                if (carry != true) result = '0' + result;
                else {
                    result = '1' + result;
                    carry = false;
                }
            }
            else {
                if (carry != true) result = '0' + result; 
                else result = '1' + result;
                carry = true;
            }

            l--;
            r--;
        }

        while (l >= 0) {
            if (carry == true) {
                if (a.charAt(l) == '0') {
                    result = '1' + result;
                    carry = false;
                }
                else {
                    result = '0' + result;
                }
            }
            else {
                result = a.charAt(l) + result;
            }
            l--;
        }

        while (r >= 0) {
            if (carry == true) {
                if (b.charAt(r) == '0') {
                    result = '1' + result;
                    carry = false;
                }
                else {
                    result = '0' + result;
                }
            }
            else {
                result = b.charAt(r) + result;
            }
            r--;
        }

        if (carry) result = '1' + result;

        return result;
    }
}