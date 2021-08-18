package before;

import java.util.HashMap;
import java.util.Map;

public class Test33 {

    public static void main(String[] args) {
        Node1 node = new Node1(1);
        Node1 node1 = new Node1(2);
        Node1 node3 = new Node1(4);
        Node1 node2 = new Node1(3);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = null;
        node1.random = node1;
        node2.random = node;
        node.random = node3;
        node3.random = node2;
        Node1 node4 = copyRandomList(node);
        System.out.println(node4.next.next.random.val);

    }

    public static Node1 copyRandomList(Node1 head) {
        Map<Node1, Node1> map = new HashMap<>();
        Node1 cur = head;
        while(cur!=null){
            map.put(cur,new Node1(cur.val));
            cur = cur.next;
        }

        cur = head;
        while (cur != null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);

    }
}

class Node1{
    int val;
    Node1 next;
    Node1 random;

    public Node1(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
