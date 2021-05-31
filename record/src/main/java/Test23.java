public class Test23 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.right.left = new TreeNode(4);
        TreeNode treeNode1 = new TreeNode(3);
        treeNode1.left = new TreeNode(4);
        System.out.println("isSubStructure(treeNode,treeNode1) = " + isSubStructure(treeNode, treeNode1));

    }


    private static boolean isSubStructure(TreeNode A, TreeNode B) {
        return A != null && B != null && (recur(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right,B));
    }

    private static boolean recur(TreeNode A, TreeNode B) {
        if (B == null) return true;
        if (A == null || A.val != B.val) return false;
        return recur(A.left, B.left) && recur(A.right, B.right);
    }
}
