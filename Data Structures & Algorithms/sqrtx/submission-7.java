class Solution {
    public int mySqrt(int x) {
        //standard binary search procedure
        int l = 0;
        int r = x;
        while (l <= r) {
            int mid = l + (r-l)/2;

            //actually fuck you for adding that test case kys immediately
            long root = ((long)mid) * ((long)mid);

            //standard binary search procedure
            if (root == x) return mid;
            else if (root < x) {
                l = mid+1;
            }
            else {
                r = mid-1;
            }
        }

        //floor operation, exit loop when r < l, so r is floor.
        return r;
    }
}