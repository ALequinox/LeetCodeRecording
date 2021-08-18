package before;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test5 {
    /*
        输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。
        假设输入的前序遍历和中序遍历的结果中都不含重复的数字。

            例如，给出

            前序遍历 preorder = [3,9,20,15,7]
            中序遍历 inorder = [9,3,15,20,7]
            返回如下的二叉树：

                3
               / \
              9  20
                /  \
               15   7
    解题：
    https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/solution/mian-shi-ti-07-zhong-jian-er-cha-shu-by-leetcode-s/
     */
    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inoder = {9,3,15,20,7};

        printTree(buildTree(preorder, inoder));
    }

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){ this.val = x;}
    }

    private static TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = null;

        if(preorder != null && preorder.length > 0){
            root = new TreeNode(preorder[0]);

            int index = getIndex(preorder[0],inorder);

            int[] leftInorder = Arrays.copyOfRange(inorder,0,index);
            int[] rightInorder = Arrays.copyOfRange(inorder,index+1,inorder.length);

            /*System.out.println(Arrays.toString(leftInorder));
            System.out.println(Arrays.toString(rightInorder));*/

            int[] leftPreorder = Arrays.copyOfRange(preorder,1,1+leftInorder.length);
            int[] rightPreorder = Arrays.copyOfRange(preorder,1+leftInorder.length,preorder.length);

            /*System.out.println(Arrays.toString(leftPreorder));
            System.out.println(Arrays.toString(rightPreorder));*/

            root.left = buildTree(leftPreorder,leftInorder);
            root.right = buildTree(rightPreorder,rightInorder);
        }
        return root;
    }

    private static int getIndex(int target, int[] targetArray){
        for (int i = 0; i < targetArray.length; i++) {
            if(target == targetArray[i]) return i;
        }
        return -1;
    }

    private static void printTree(TreeNode root){
        System.out.print(root.val+" ");
        if(root.left != null){
            printTree(root.left);
        }
        if(root.right != null){
            printTree(root.right);
        }
    }
}
