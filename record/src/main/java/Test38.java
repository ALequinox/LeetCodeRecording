import java.util.*;

public class Test38 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Test38().permutation("123")));
    }

    /*
    输入一个字符串，打印出该字符串中字符的所有排列。
    你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。

    示例:
    输入：s = "abc"
    输出：["abc","acb","bac","bca","cab","cba"]

    题解:
    https://leetcode-cn.com/problems/zi-fu-chuan-de-pai-lie-lcof/solution/mian-shi-ti-38-zi-fu-chuan-de-pai-lie-hui-su-fa-by/
     */
    private char[] c;
    private List<String> res = new LinkedList<>();
    public String[] permutation(String s) {
        c = s.toCharArray();
        dfs(0);
        return res.toArray(new String[0]);
    }

    private void dfs(int x) {
        if(x == c.length-1){
            res.add(new String(c));
            return;
        }

        Set<Character> set = new HashSet<>();
        for (int i = x; i < c.length; i++) {
            if (set.contains(c[i])) {
                continue;
            }
            set.add(c[i]);
            swap(i,x);
            dfs(x+1);
            swap(x,i);
        }
    }

    private void swap(int i, int x) {
        char tmp = c[x];
        c[x] = c[i];
        c[i] = tmp;
    }
}
