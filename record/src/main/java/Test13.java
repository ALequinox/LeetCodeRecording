public class Test13 {

    public static void main(String[] args) {
        System.out.println(hammingWeight(9));
    }

    public static int hammingWeight(int n) {
        int res = 0;
        while(n!=0){
            res += n&1;
            n >>>=1;
        }

        return res;
    }
}
