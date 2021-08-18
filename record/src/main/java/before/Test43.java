package before;

public class Test43 {

    public static void main(String[] args) {
        System.out.println(new Test43().countDigitOne(110));
    }
    /*
    输入一个整数 n ，求1～n这n个整数的十进制表示中1出现的次数。
    例如，输入12，1～12这些整数中包含1 的数字有1、10、11和12，1一共出现了5次。

    题解:
    https://leetcode-cn.com/problems/1nzheng-shu-zhong-1chu-xian-de-ci-shu-lcof/solution/mian-shi-ti-43-1n-zheng-shu-zhong-1-chu-xian-de-2/
     */
    public int countDigitOne(int n) {
        int res = 0;
        int digit = 1,cur = n%10, high = n/10, low = 0;
        while (cur != 0 || high != 0){
            if(cur == 0) res += high*digit;
            else if(cur == 1) res += high*digit+low+1;
            else if(cur > 1) res += (high+1)*digit;
            low += cur*digit;
            cur = high%10;
            high = high/10;
            digit *= 10;
        }
        return res;

    }
}
