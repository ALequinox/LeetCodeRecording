package before;

public class Test25 {
    /*
    题解：
    https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/solution/mian-shi-ti-28-dui-cheng-de-er-cha-shu-di-gui-qing/
     */
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(3);
        treeNode.right.right = new TreeNode(4);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(3);
        System.out.println("isSymmetric(treeNode) = " + isSymmetric(treeNode));
    }

    private static boolean isSymmetric(TreeNode root) {
        return root == null || recur(root.left, root.right);
    }

    private static boolean recur(TreeNode L, TreeNode R){
        if(L==null && R== null) return true;
        if(L == null || R == null || L.val != R.val) return false;
        return recur(L.left,R.right) && recur(L.right,R.left);
    }
}
