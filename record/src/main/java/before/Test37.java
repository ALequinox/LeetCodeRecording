package before;

import java.util.LinkedList;
import java.util.Queue;

public class Test37 {

    /*
        请实现两个函数，分别用来序列化和反序列化二叉树。
        你需要设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。
        题解：
        https://leetcode-cn.com/problems/xu-lie-hua-er-cha-shu-lcof/solution/mian-shi-ti-37-xu-lie-hua-er-cha-shu-ceng-xu-bian-/
     */
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
