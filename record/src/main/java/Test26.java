import java.util.Arrays;

public class Test26 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(Arrays.toString(spiralOrder(a)));
    }

    private static int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
        int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1, k = 0;
        int[] res = new int[matrix.length * matrix[0].length];
        while (true) {
            for (int i = l; i <= r; i++) res[k++] = matrix[t][i];
            if (++t > b) break;
            for (int i = t; i <= b; i++) res[k++] = matrix[i][r];
            if (--r < l) break;
            for (int i = r; i >= l; i--) res[k++] = matrix[b][i];
            if (--b < t) break;
            for (int i = b; i >= t; i--) res[k++] = matrix[i][l];
            if (++l > r) break;
        }
        return res;
    }
}
