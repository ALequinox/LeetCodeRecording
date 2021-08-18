package before;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Test28 {
    /*
    题解：
    https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/solution/mian-shi-ti-32-i-cong-shang-dao-xia-da-yin-er-ch-4/
     */
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(7);
        System.out.println(Arrays.toString(levelOrder(treeNode)));
    }

    private static int[] levelOrder(TreeNode root) {
        if (root == null) return new int[0];
        Deque<TreeNode> queue = new LinkedList<>();
        int[] print = new int[1000];
        int i=0;
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            print[i++] = node.val;
            if(node.left!=null) queue.add(node.left);
            if(node.right!=null) queue.add(node.right);
        }
        return Arrays.copyOf(print,i);
    }
}
