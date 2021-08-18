package before;

import java.util.Deque;
import java.util.LinkedList;

public class Test20 {

    /**
     * 题解：https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/solution/mian-shi-ti-22-lian-biao-zhong-dao-shu-di-kge-j-11/
     *
     */
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(5);
        ListNode n4 = new ListNode(6);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        ListNode node = getKthFromEnd(head, 2);
        System.out.println(node.next.val);
    }

    private static ListNode getKthFromEnd(ListNode head, int k) {

        Deque<ListNode> stack = new LinkedList<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        while (k-- > 0) {
            head = stack.pop();
        }
        return head;
    }
}
