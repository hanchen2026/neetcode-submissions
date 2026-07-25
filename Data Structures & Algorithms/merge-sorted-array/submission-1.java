class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //instantiate initial pointers
        int l = m - 1;
        int ptr = nums1.length - 1;
        int r = n - 1;

        //While either is greater than 0 (at least 1 is non-empty)
        //greater than or equal to is important here, else it will skip last indice.
        while (l >= 0 && r >= 0) {
            if (nums1[l] < nums2[r]) {            //left < right
                nums1[ptr] = nums2[r];
                r--;
                ptr--;
            }
            else {                                  //insert elements in place (shift nums1)
                nums1[ptr] = nums1[l];
                nums1[l] = 0;
                ptr--;
                l--;
            }
        }

        //finish early for the other component. G/E is important here for the same reason as above.
        while (r >= 0) {
            nums1[ptr] = nums2[r];
            r--;
            ptr--;
        }

        while (l >= 0) {
            nums1[ptr] = nums1[l];
            l--;
            ptr--;
        }
    }
}