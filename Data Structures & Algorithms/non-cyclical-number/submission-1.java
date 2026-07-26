class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        boolean ret = false;

        while (!set.contains(n)) {
            System.out.println("N: " + n);
            set.add(n);
            int num = 0;
            while (n > 0) {
                int temp = n % 10;
                n /= 10;
                num += (temp * temp);
            }
            if (num == 1) return true; 
            n = num;
            System.out.println("N: " + n);
        }

        return ret;
    }
}
