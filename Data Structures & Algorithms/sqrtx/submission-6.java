class Solution {
    public int mySqrt(int x) {
        int l = 0;
        int r = x;
        int mid = l + (r-l)/2;

        while (l <= r) {
            mid = l + (r-l)/2;
            long root = ((long)mid) * ((long)mid);
            if (root == x) return mid;
            else if (root < x) {
                l = mid+1;
            }
            else {
                r = mid-1;
            }
        }

        return r;
    }
}