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
        //edge case
        if (head == null) return null;

        ListNode ptr = head;
        ListNode prev = null;
        ListNode next = ptr;

        while (ptr != null) {
            next = ptr.next;
            ptr.next = prev;
            prev = ptr;
            ptr = next;
        }

        return prev;
    }

    private void printEntireThing(ListNode head) {
        ListNode ptr = head;

        while(ptr != null) {
            System.out.println(ptr.val);
            ptr = ptr.next;
        }
    }
}
