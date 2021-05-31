public class Test24 {
    /*
    题解:
    https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/solution/mian-shi-ti-27-er-cha-shu-de-jing-xiang-di-gui-fu-/
     */
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(5);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(7);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(4);
        TreeNode treeNode1 = mirrorTree(treeNode);
        System.out.println("treeNode1.right.right = " + treeNode1.right.right.val);
    }

    private static TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        if (root.left != null) mirrorTree(root.left);
        if (root.right != null) mirrorTree(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }


}
