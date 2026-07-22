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
        ListNode ptr = head;
        ListNode ret = new ListNode();

        while (ptr != null) {
            System.out.println(ptr.val);

            ret.val = ptr.val;
            ptr = ptr.next;

            ListNode temp = new ListNode();
            temp.next = ret;
            ret = temp;
        }

        return ret.next;
    }
}
