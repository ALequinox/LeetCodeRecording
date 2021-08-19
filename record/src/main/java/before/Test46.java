package before;

public class Test46 {

    public static void main(String[] args) {
        System.out.println(new Test46().translateNum(18822));
    }
    /*
    剑指 Offer 46. 把数字翻译成字符串
        给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。
        请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
        题解:https://leetcode-cn.com/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof/solution/mian-shi-ti-46-ba-shu-zi-fan-yi-cheng-zi-fu-chua-6/

        动态规划
     */
    public int translateNum(int num) {
        int count = 1, count1 = 1;
        String s = Integer.toString(num);

        for (int i = 1; i < s.length(); i++) {
            int n = (s.charAt(i) - '0') + (s.charAt(i - 1) - '0') * 10;
            int tmp = n <= 25 && n >= 10 ? count1 + count : count1;
            count = count1;
            count1 = tmp;
        }
        return count1;
    }


}
