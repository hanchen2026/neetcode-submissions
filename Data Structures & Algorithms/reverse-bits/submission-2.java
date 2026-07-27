class Solution {
    public int reverseBits(int n) {

        //start with 0
        int result = 0;

        //32 bit solution, so does it 32 times.
        for (int i = 0; i < 32; i++) {

            //extract next digit for sol
            result = result << 1;

            // what teh fuck
            result = result | (n & 1);

            //move to next digit after done
            n >>= 1;
        }

        return result;
    }
}
