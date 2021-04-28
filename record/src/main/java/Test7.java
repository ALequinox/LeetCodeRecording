import java.util.Arrays;

public class Test7 {
    /*
    写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：

    F(0) = 0,   F(1) = 1
    F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
    斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。

    答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。

 
    注:
        青蛙跳台阶问题:
        一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。

        答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。

        示例 1：

        输入：n = 2
        输出：2
        示例 2：

        输入：n = 7
        输出：21
        示例 3：

        输入：n = 0
        输出：1


        解答这两个问题都使用动态规划方法。
        解答解析:
        https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/solution/mian-shi-ti-10-i-fei-bo-na-qi-shu-lie-dong-tai-gui/
 */

    public static void main(String[] args) {
        System.out.println(fib(2));
    }

    private static int fib(int n) {
        int a,b,sum;
        a = 0;
        b = 1;
        for (int i = 0; i < n; i++) {
            sum = (a+b)%1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
