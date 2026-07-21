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
    public boolean hasCycle(ListNode head) {
        //classic slow-fast pointers
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null) {   //go until fast breaks loop
            if (fast.next == null) break;       //if next is null there is no cycle
            slow = slow.next;   
            fast = fast.next.next;
            if (fast == slow && fast != null) return true;      //if pointers ever meet, they are looping
        }

        return false;
    }
}
