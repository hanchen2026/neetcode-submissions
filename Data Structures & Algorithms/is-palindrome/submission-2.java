class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        HashSet<Character> set = new HashSet<>();
        populate(set);

        while (l <= r) {
            if (!set.contains(s.charAt(l)) && !set.contains(s.charAt(r))) {
                l++;
                r--;
                System.out.println("trigger1");
                continue;
            }
            else if (!set.contains(s.charAt(l))) {
                l++;
                continue;
            }
            else if (!set.contains(s.charAt(r))) {
                r--;
                continue;
            }
            
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) return false;

            l++;
            r--;
        }

        return true;
    }

    private void populate(HashSet<Character> set) {
        for (int i = 65; i < (65+26); i++) {
            set.add((char) i);
        }

        for (int i = 97; i < (97+26); i++) {
            set.add((char) i);
        }

        set.add('0');
        set.add('1');
        set.add('2');
        set.add('3');
        set.add('4');
        set.add('5');
        set.add('6');
        set.add('7');
        set.add('8');
        set.add('9');
    }
}
