import java.util.HashSet;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class _160 {
    public ListNode getIntersectionNode(ListNode a, ListNode B) {
        

        if (headA == null || headB == null)
            return null;
        int count = 0;
        HashSet<ListNode> ar = new HashSet<>();
        while (headA != null) {
            count++;
            headA = headA.next;
        }

        while (headB != null) {
            count--;
            headB = headB.next;
        }

        if(count > 0){ // a>b

            while(headA!=null){
                if(count ==0) break;
                count--;
                headA = headA.next;
            }
        }
        else {
            while(headB!=null){
                if(count ==0) break;
                count--;
                headB = headB.next;
            }
        }

        while(headA!=null && headB!=null){
            if(headA == headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }

        return null;
    }
}