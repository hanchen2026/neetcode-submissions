/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        //create two pointers, one prev and a current pointer
        ListNode ptr = head;
        ListNode prev = null;

        while (ptr != null) {
            //create a pointer to the next true node
            ListNode temp = ptr.next;

            //flip direction of pointer
            ptr.next = prev;

            //change previous to current node
            prev = ptr;

            //go to the next true node
            ptr = temp;
        }

        //ptr is null, so return the previous of null and that is the head of the LL.
        return prev;
    }
}
