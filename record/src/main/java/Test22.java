public class Test22 {
    /*
    题解：https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/solution/mian-shi-ti-25-he-bing-liang-ge-pai-xu-de-lian-b-2/
     */
    public static void main(String[] args) {
        ListNode head1 = new ListNode(2);
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(7);
        head1.next = n1;
        n1.next = n2;
        n2.next = null;
        ListNode head2 = new ListNode(1);
        ListNode n = new ListNode(4);
        ListNode n3 = new ListNode(5);
        ListNode n4 = new ListNode(6);
        head2.next = n;
        n.next = n3;
        n3.next = n4;
        n4.next = null;
        ListNode l = mergeTwoLists(head1, head2);
        while (l != null) {
            System.out.print(l.val + " -> ");
            l = l.next;
        }

    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1, p2, p3, l3;
        p1 = l1;
        p2 = l2;
        p3 = l3 = new ListNode(0);
        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                p3.next = new ListNode(p1.val);
                p1 = p1.next;
            } else {
                p3.next = new ListNode(p2.val);
                p2 = p2.next;
            }
            p3 = p3.next;
        }
        if (p1 != null) {
            p3.next = p1;
        }
        if (p2 != null) {
            p3.next = p2;
        }
        return l3.next;
    }
}
