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
class _2807 {
      public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null)
            return null;

        ListNode first = head;
        ListNode second = head.next;

        while (second != null) {
            ListNode temp = new ListNode(gcd(first.val, second.val));
            first.next = temp;
            temp.next = second;
            first = second;
            second = second.next;
        }

        return head;
    }
}