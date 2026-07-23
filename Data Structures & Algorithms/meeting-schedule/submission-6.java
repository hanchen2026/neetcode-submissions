/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        //sort for consistency (and O(n logn) runtime)
        Collections.sort(intervals, Comparator.comparingInt(i -> i.start));

        boolean canAttend = true;
        int l = -1;
        int r = -1;

        for(Interval i: intervals) {
            //initializing
            if (l == -1 && r == -1) {
                l = i.start;
                r = i.end;
            }
            else if (i.start >= r && i.end >= r) {
                r = i.end;
            }
            else {
                return false;
            }
        }


        return canAttend;
    }
}
