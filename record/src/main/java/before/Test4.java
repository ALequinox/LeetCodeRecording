package before;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test4 {
    /*
    剑指 Offer 06. 从尾到头打印链表
    输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。

    输入：head = [1,3,2]
    输出：[2,3,1]

    解题：
    https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/solution/mian-shi-ti-06-cong-wei-dao-tou-da-yin-lian-biao-b/
     */

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        head.next = node2;
        node2.next = node3;
        node3.next = null;

        System.out.println(Arrays.toString(reversePrint(head)));
    }

    private   static  int[] reversePrint(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode p = head;
        while(p!=null){
            list.add(p.val);
            p = p.next;
        }
        int[] r = new int[list.size()];
        for (int i = list.size()-1; i >= 0; i--) {
            r[list.size()-1-i] = list.get(i);
        }
        return r;
    }

    static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
    }
}
