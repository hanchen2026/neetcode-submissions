/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int high = n;
        int low = 0;

        while(true) {
            //safe from overflow (low + high) / 2 overflows
            // (L+H)/2 == (H + 2L - L)/2 = 2L/2 + (H-L)/2 => L + (H-L)/2.
            int mid = low + (high-low) / 2;
            int ret = guess(mid);
            
            if (ret == 1) low = mid+1;
            else if (ret == -1) high = mid-1;
            else return mid;
        }
    }
}