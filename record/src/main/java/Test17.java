public class Test17 {
    /*
    剑指 Offer 19. 正则表达式匹配
        请实现一个函数用来匹配包含'. '和'*'的正则表达式。模式中的字符'.'表示任意一个字符，
    而'*'表示它前面的字符可以出现任意次（含0次）。在本题中，匹配是指字符串的所有字符匹配整个模式。
    例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但与"aa.a"和"ab*a"均不匹配。

    使用动态规划的解法

    题解：
    https://leetcode-cn.com/problems/zheng-ze-biao-da-shi-pi-pei-lcof/solution/zhu-xing-xiang-xi-jiang-jie-you-qian-ru-shen-by-je/
     */

    public static void main(String[] args) {
        System.out.println(isMatch("abaa", ".*"));
    }

    public static boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        boolean[][] res = new boolean[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (j == 0) {
                    res[i][j] = i == 0;
                } else {
                    if (p.charAt(j - 1) != '*') {
                        if (i > 0 && (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.')) {
                            res[i][j] = res[i - 1][j - 1];
                        }
                    } else {
                        if (j > 1) {
                            res[i][j] |= res[i][j - 2];
                        }
                        if (i > 0 && j > 1 && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.')) {
                            res[i][j] |= res[i - 1][j];
                        }
                    }
                }
            }
        }
        return res[n][m];
    }
}
