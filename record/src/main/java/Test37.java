import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test37 {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(7);

        TreeNode node = new Test37().deserialize("[1,2,3,null,null,6,7,null,null,null,null]");
        System.out.println(new Test37().serialize(node));
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "[]";
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        StringBuilder str = new StringBuilder("[");
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node!=null){
                str.append(node.val).append(",");
                queue.add(node.left);
                queue.add(node.right);
            }else{
                str.append("null,");
            }
        }
        str.delete(str.length()-1,str.length());
        str.append("]");
        return str.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("[]")) return null;
        String[] vals = data.substring(1,data.length()-1).split(",");
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        queue.add(root);
        int index = 1;
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node != null){
                if(!vals[index].equals("null")) {
                    node.left = new TreeNode(Integer.parseInt(vals[index]));
                    queue.add(node.left);
                }else {
                    node.left = null;
                }
                index++;
                if(!vals[index].equals("null")) {
                    node.right = new TreeNode(Integer.parseInt(vals[index]));
                    queue.add(node.right);
                }else {
                    node.right = null;
                }
                index++;
            }
        }
        return root;
    }
}
