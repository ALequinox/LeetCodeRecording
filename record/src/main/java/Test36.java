import java.util.LinkedList;
import java.util.List;

public class Test36 {
    public static void main(String[] args) {
        Node node = new Node(5);
        Node node1 = new Node(3);
        Node node2 = new Node(1);
        Node node3 = new Node(4);
        Node node4 = new Node(6);
        node.left = node1;
        node.right = node4;
        node1.left = node2;
        node1.right = node3;
        new Test36().treeToDoublyList(node);

    }

    public Node treeToDoublyList(Node root) {
        List<Node> nodeList = new LinkedList<>();
        traverse(root,nodeList);
        System.out.println(nodeList);
        return null;
    }

    private void traverse(Node root, List<Node> nodeList) {
        if (root == null){
            return;
        }
        traverse(root.left,nodeList);
        nodeList.add(root);
        traverse(root.left,nodeList);
    }
}
