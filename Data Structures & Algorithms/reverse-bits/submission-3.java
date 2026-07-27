class Solution {
    public int reverseBits(int n) {

        //start with 0
        int result = 0;

        //32 bit solution, so does it 32 times.
        for (int i = 0; i < 32; i++) {

            //extract next digit for sol
            result = result << 1;

            // (x & 1) extracts the LAST value of the binary, 
            // which is later OR-ed to keep the value in teh reversed result parameter
            result = result | (n & 1);

            //move to next digit after done
            n >>= 1;
        }

        return result;
    }
}
