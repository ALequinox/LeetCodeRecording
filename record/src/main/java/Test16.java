public class Test16 {
    /*
    剑指 Offer 18. 删除链表的节点
    给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。

    返回删除后的链表的头节点
    题解：
    https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/solution/mian-shi-ti-18-shan-chu-lian-biao-de-jie-dian-sh-2/
     */


    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(4);
        ListNode p3 = new ListNode(5);
        head.next = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = null;
        ListNode p = head;
        while(p != null){
            System.out.print(p.val+"->");
            p = p.next;
        }
        deleteNode(head,1);
        p = head;
        System.out.println();
        while(p != null){
            System.out.print(p.val+"->");
            p = p.next;
        }

    }

    public static ListNode deleteNode(ListNode head, int val) {
        if(head.val == val) return head.next;
        ListNode p = head.next;
        ListNode preP = head;
        while (p != null) {
            if (p.val == val) {
                preP.next = p.next;
                break;
            }
            p = p.next;
            preP = preP.next;
        }
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
