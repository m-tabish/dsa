class _23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode d = new ListNode();
        if (lists.length == 0)
            return null;
        if (lists.length == 1)
            return lists[0];
        d.next = lists[0];
        for (int i = 1; i < lists.length; i++) {
            ListNode temp = d;
            ListNode a = d.next, b = lists[i];
            while (a != null && b != null) {
                if (a.val <= b.val) {
                    temp.next = a;
                    temp = a;
                    a = a.next;
                } else {
                    temp.next = b;
                    temp = b;
                    b = b.next;
                }
            }
            // if a still has nodes
            if (a != null && b == null)
                temp.next = a;

            // if b still has nodes
            if (a == null && b != null)
                temp.next = b;


        }
        return d.next;

    }
}
