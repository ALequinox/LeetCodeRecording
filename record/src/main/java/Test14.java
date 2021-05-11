public class Test14 {

    /*
    剑指 Offer 16. 数值的整数次方
    实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。
    不得使用库函数，同时不需要考虑大数问题。

    题解：
    https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/solution/mian-shi-ti-16-shu-zhi-de-zheng-shu-ci-fang-kuai-s/
     */
    public static void main(String[] args) {
        System.out.println(myPow(2, -2));
    }

    public static double myPow(double x, int n) {
        double res = 1;
        if (x == 1) return x;
        if (x == 0) return 0;
        long b = n;
        if (n < 0) {
            x = 1 / x;
            b = Math.abs(b);
        }
        while (b > 0) {
            if ((b & 1) == 1) res *= x;
            x *= x;
            b >>= 1;
        }
        return res;
    }
}
