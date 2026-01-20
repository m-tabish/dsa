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
    // CONSTANT SPACE
class Solution {
    public int getDecimalValue(ListNode head) {
        int n = 0;
        String s = "";
        while (head != null) {
            n = (n << 1) | head.val;
            head = head.next;
        }

        return n;
    }
}