import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Test33 {

    public static void main(String[] args) {
        Node node = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = null;
        node1.random = node1;
        node2.random = node;
        node.random = node3;
        node3.random = node2;
        Node node4 = copyRandomList(node);
        System.out.println(node4.next.next.random.val);

    }

    public static Node copyRandomList(Node head) {
        Map<Node,Node> map = new HashMap<>();
        Node cur = head;
        while(cur!=null){
            map.put(cur,new Node(cur.val));
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
