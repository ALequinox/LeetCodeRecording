public class Test44 {

    public static void main(String[] args) {
        System.out.println(new Test44().findNthDigit(1000000000));
    }
    /*

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
