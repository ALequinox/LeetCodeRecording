public class Test3 {
    /*
    剑指 Offer 05. 替换空格
    请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
    输入：s = "We are happy."
    输出："We%20are%20happy."
     */
    public static void main(String[] args) {
        String s = "    ";
        System.out.println(replaceSpace(s));
    }

    private static String replaceSpace(String s) {
        return s.replace(" ","%20");
    }

}
