import java.util.Deque;
import java.util.LinkedList;

public class Test27 {

    /*
    题解：
    https://leetcode-cn.com/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof/solution/mian-shi-ti-31-zhan-de-ya-ru-dan-chu-xu-lie-mo-n-2/
     */
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {5,3,4,2,1};
        System.out.println(validateStackSequences(a, b));
    }

    private static boolean validateStackSequences(int[] pushed, int[] popped) {
        int p = 0, q = 0;
        Deque<Integer> stack = new LinkedList<>();
        boolean res = true;
        for (int value : popped) {
            for (int i = p; i < pushed.length; i++) {
                if (pushed[i] == value) {
                    stack.push(pushed[i]);
                    p = i+1;
                    break;
                } else {
                    stack.push(pushed[i]);
                }
            }

            boolean flag = false;
            while (!stack.isEmpty()) {
                if (value == stack.pop()) {
                    flag = true;
                    break;
                }
            }
            res &= flag;
        }
        return res;
    }
}
