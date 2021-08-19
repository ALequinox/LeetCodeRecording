package jianzhi.integer;

import java.util.Arrays;

public class CountBit {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new CountBit().countBits(8)));
    }

    public int[] countBits(int n) {
        int[] res = new int[n+1];
        res[0] = 0;
        for (int i = 1; i <= n; i++) {
            int count = i % 2;
            count += res[i/2];
            res[i] = count;
        }
        return res;
    }

}
