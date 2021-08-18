package before;

public class Test44 {

    public static void main(String[] args) {
        System.out.println(new Test44().findNthDigit(1000000000));
    }
    /*
        数字以0123456789101112131415…的格式序列化到一个字符序列中。在这个序列中，第5位（从下标0开始计数）是5，第13位是1，第19位是4，等等。
        请写一个函数，求任意第n位对应的数字。
     题解:
     https://leetcode-cn.com/problems/shu-zi-xu-lie-zhong-mou-yi-wei-de-shu-zi-lcof/solution/mian-shi-ti-44-shu-zi-xu-lie-zhong-mou-yi-wei-de-6/
     */
    public int findNthDigit(int n) {
        long digit=1,count = 9,start = 1;
        while (n > count){
            n -= count;
            digit += 1;
            start *= 10;
            count = 9*start*digit;
        }
        long num = start + (n-1)/digit;
        return Integer.parseInt(String.valueOf(Long.toString(num).charAt((int) ((n-1)%digit))));
    }
}
