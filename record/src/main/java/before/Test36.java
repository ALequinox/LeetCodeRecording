package before;

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
        Node node5 = new Test36().treeToDoublyList(new Node(1));
        for (int i = 0; i < 5; i++) {
            System.out.println(node5.val);
            node5 = node5.left;
        }

    }

    public Node treeToDoublyList(Node root) {
        if (root == null) return root;
        List<Node> nodeList = new LinkedList<>();
        traverse(root,nodeList);
        if(nodeList.size() <= 1){
            nodeList.get(0).right = nodeList.get(0);
            nodeList.get(0).left = nodeList.get(0);
            return nodeList.get(0);
        }
        int pre = -1;
        for (int i = 0; i < nodeList.size(); i++) {
           if(pre == -1){
               nodeList.get(i).right = nodeList.get(i+1);
           }else if(i == nodeList.size()-1){
               nodeList.get(i).left = nodeList.get(i-1);
           }else{
               nodeList.get(i).right = nodeList.get(i+1);
               nodeList.get(i).left = nodeList.get(i-1);
           }
           pre++;
        }
        nodeList.get(0).left = nodeList.get(nodeList.size()-1);
        nodeList.get(nodeList.size()-1).right =nodeList.get(0);
        return nodeList.get(0);
    }

    private void traverse(Node root, List<Node> nodeList) {
        if (root == null){
            return;
        }
        traverse(root.left,nodeList);
        nodeList.add(root);
        traverse(root.right,nodeList);
    }
}
