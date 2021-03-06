package before;

public class Test13 {

    /*
    剑指 Offer 15. 二进制中1的个数
    请实现一个函数，输入一个整数（以二进制串形式），输出该数二进制表示中 1 的个数。例如，
    把 9 表示成二进制是 1001，有 2 位是 1。因此，如果输入 9，则该函数输出 2。

    题解：
    https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/solution/mian-shi-ti-15-er-jin-zhi-zhong-1de-ge-shu-wei-yun/
     */
    public static void main(String[] args) {
        System.out.println(hammingWeight(9));
    }

    public static int hammingWeight(int n) {
        int res = 0;
        while(n!=0){
            res += n&1;
            n >>>=1;
        }

        return res;
    }
}
