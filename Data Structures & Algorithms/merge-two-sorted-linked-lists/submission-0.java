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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode ptr = head;

        //while NEITHER lists 1 OR 2 is null (F & T = F)
        while(list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                ptr.next = list1;
                list1 = list1.next;
            }
            else {
                ptr.next = list2;
                list2 = list2.next;
            }
            ptr = ptr.next;
        }

        //fill in the rest of the missing list (1 is not empty)
        if (list1 != null) {
            while (list1 != null) {
                ptr.next = list1;
                list1 = list1.next;
                ptr = ptr.next;
            }
        }
        else {
            while (list2 != null) {
                ptr.next = list2;
                list2 = list2.next;
                ptr = ptr.next;
            }
        }

        return head.next;
    }
}