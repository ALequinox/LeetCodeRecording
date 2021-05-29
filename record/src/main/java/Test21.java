import java.util.Deque;
import java.util.LinkedList;

public class Test21 {
    /*
    题解：
    https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/solution/fan-zhuan-lian-biao-yi-dong-de-shuang-zhi-zhen-jia/
     */
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(5);
        ListNode n4 = new ListNode(6);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        ListNode node = reverseList(head);
        System.out.println(node.next.val);
    }

    private static ListNode reverseList(ListNode head) {
        if(head == null) return null;
        Deque<ListNode> stack = new LinkedList<>();
        int k=0;
        while (head != null) {
            stack.push(head);
            head = head.next;
            k++;
        }
        ListNode h = stack.pop();
        ListNode p = h;
        while (!stack.isEmpty()){
            ListNode node = stack.pop();
            p.next = node;
            node.next = null;
            p = node;
        }
        return h;
    }
}
