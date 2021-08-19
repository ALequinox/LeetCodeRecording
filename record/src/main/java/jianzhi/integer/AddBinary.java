package jianzhi.integer;

import java.math.BigInteger;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(new AddBinary().addBinary("10", "11"));
    }

    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int count = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0 || count > 0; i--, j--) {
            int total = count;
            total += i >= 0 ? a.charAt(i) - '0' : 0;
            total += j >= 0 ? b.charAt(j) - '0' : 0;
            count = total > 1 ? 1 : 0;
            res.append(total-count*2);
        }
        return res.reverse().toString();
    }
}
