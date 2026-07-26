class Solution {
    public int romanToInt(String s) {

        //Map of characters in string:
        Map<Character, Integer> map = Map.of(
        'I', 1,
        'V', 5,
        'X', 10,
        'L', 50,
        'C', 100,
        'D', 500,
        'M', 1000
        );

        int total = 0;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i == s.length() - 1) {
                total += map.get(c);
            }
            //look at next character
            else if (c == 'I' && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')) {
                total -= map.get(c);
            }
            else if (c == 'X' && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')) {
                total -= map.get(c);
            }
            else if (c == 'C' && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M'))  {
                total -= map.get(c);
            }
            else {
                total += map.get(c);
            }
        }

        return total;
    }
}