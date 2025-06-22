
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


public class _143 {
    public void reorderList(ListNode head) {
        ListNode slow = head, fast = head;

        // Find middle of list
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // split from middle and reverse second half

        ListNode prev = null, cur = slow.next;
        slow.next = null;

        while (slow != null) {
            cur.next = prev;
            prev = cur;
            cur = slow;
            slow = slow.next;
        }


        ListNode temp = head, temp2 = head;
        while (cur != null) {
            temp.next = cur;
            cur = cur.next;
            temp.next = temp2;
            temp2 = temp2.next;
        }

    }

}
