package before;

import java.util.LinkedList;
import java.util.List;

public class Test32 {
    public static void main(String[] args) {

    }

    private List<List<Integer>> res = new LinkedList<>();
    private LinkedList<Integer> path = new LinkedList<>();
    public  List<List<Integer>> pathSum(TreeNode root, int target) {
       recur(root,target);
        return res;
    }

    private void recur(TreeNode root, int target) {
        if(root == null)return;
        path.add(root.val);
        target -= root.val;
        if(target == 0 && root.left == null && root.right == null){
            res.add(new LinkedList<>(path));
        }
        recur(root.left,target);
        recur(root.right,target);
        path.removeLast();
    }


}
