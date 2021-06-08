public class Test31 {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,6,7,5};
        System.out.println(verifyPostorder(a));

    }

    private static boolean verifyPostorder(int[] postorder) {

        return recur(postorder,0,postorder.length-1);
    }

    private static boolean recur(int[] postorder, int i, int j){
        if(i>=j) return true;
        int p = i;
        while (postorder[p] < postorder[j]) p++;
        int m = p;
        while (postorder[p] > postorder[j]) p++;
        return p==j&&recur(postorder,i,m-1)&&recur(postorder,m,j-1);
    }
}
