
// Definition for singly-linked list.
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


public class _21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode c1 = list1;
        ListNode c2 = list2;
        if (list1 == null && list2 == null)
            return null;
        else if (list1 == null && list2 != null)
            return list2;
        else if (list1 != null && list2 == null)
            return list1;

        ListNode ans = new ListNode();
        ListNode start = ans;

        while (c1 != null && c2 != null) {

            if (c1.val < c2.val) {
                start.next = c1;
                c1 = c1.next;
            } else {
                start.next = c2;
                c2 = c2.next;
            }
            start = start.next;

        }

        if (c1 != null && c2 == null) {
            start.next = c1;
        } else if (c2 != null && c1 == null) {
            start.next = c2;
        }
        return ans.next;
    }
}

