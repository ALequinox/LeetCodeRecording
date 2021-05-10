public class Test12 {
    /*
    剑指 Offer 14- II. 剪绳子 II
    给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m - 1] 。请问 k[0]*k[1]*...*k[m - 1] 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。

    答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。

    解题的思路和上一题一样，主要难点在于大数求余
    解题：
    https://leetcode-cn.com/problems/jian-sheng-zi-ii-lcof/solution/mian-shi-ti-14-ii-jian-sheng-zi-iitan-xin-er-fen-f/
     */
    public static void main(String[] args) {
        int n = 127;
        System.out.println(cuttingRope(n));
    }

    private static int cuttingRope(int n) {
        if (n < 4) return n - 1;
        int a = n / 3, b = n % 3, p = 1000000007;
        long rem = 1, x = 3;
        for (int i = 0; i < (b == 1 ? a - 1 : a); i++) {
            rem = (rem * x) % p;
        }
        if (b == 1) return (int) (rem * 2 * 2 % p);
        if (b == 2) return (int) (rem * 2 % p);
        return (int) (rem % p);
    }

}
