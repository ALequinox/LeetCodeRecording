package jianzhi.integer;

public class IntegerDivide {

    public static void main(String[] args) {
        System.out.println(new IntegerDivide().divide(15, 2));
        System.out.println(-7 / -3);
        //System.out.println("10111 / 0010");
    }

//    @Deprecated
//    public int divide(int a, int b) {
//        long remainder = 0;
//        int sign = 1;
//        if(a == Integer.MIN_VALUE && b == -1){
//            return Integer.MAX_VALUE;
//        }
//        long c = a;
//        long d = b;
//        if(a < 0){
//            sign = -sign;
//            c = -c;
//        }
//        if(b<0){
//            sign = -sign;
//            d = -d;
//        }
//        if (d > c){
//            return 0;
//        }
//        long divideNum = d;
//        while (c >= d) {
//            d = d << 1;
//        }
//        d = d >> 1;
//        remainder = c;
//        StringBuilder res = new StringBuilder();
//        res.append(0);
//        while (d >= divideNum) {
//            if (remainder >= d) {
//                res.append(1);
//                remainder -= d;
//                d = d >> 1;
//            } else {
//                res.append(0);
//                d = d >> 1;
//            }
//        }
//        int result = (int) Long.parseLong(res.toString(), 2);
//        if (sign < 0){
//            result = -result;
//        }
//        return result;
//    }

    public int divide(int a, int b) {
        int sign = 0;
        if (a > 0) {
            sign += 1;
            a = -a;
        }
        if (b > 0) {
            sign += 1;
            b = -b;
        }
        int res = 0;
        while (a <= b) {
            int count = 1;
            int value = b;
            while (value >= Integer.MIN_VALUE >> 1 && a <= value << 1) {
                count = count << 1;
                value = value << 1;
            }
            res -= count;
            a -= value;
        }
        if (sign != 1 && res == Integer.MIN_VALUE) {
            res++;
        }
        return sign != 1 ? -res : res;
    }
}
