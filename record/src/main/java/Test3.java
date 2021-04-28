public class Test3 {
    /*
    剑指 Offer 05. 替换空格
    请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
    输入：s = "We are happy."
    输出："We%20are%20happy."

    解题:
    https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/solution/mian-shi-ti-05-ti-huan-kong-ge-by-leetcode-solutio/
     */
    public static void main(String[] args) {
        String s = "    ";
        System.out.println(replaceSpace(s));
    }

    private static String replaceSpace(String s) {
        return s.replace(" ","%20");
    }

}
