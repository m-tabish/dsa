/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next; ListNode(int x) { val
 * = x; next = null; } }
 */
public class _141 {

    public boolean hasCycle(ListNode head) {

        ListNode temp = head;
        while (head != null && head.next != null) {

            temp = temp.next;
            head = head.next.next;
            if (temp == head)
                return true;
        }
        return false;
    }
}
s