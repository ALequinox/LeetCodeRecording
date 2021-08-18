package before;

public class Test10 {
    /*
    剑指 Offer 13. 机器人的运动范围
    地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，
    它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。
    例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，
    因为3+5+3+8=19。请问该机器人能够到达多少个格子？

     */
    public static void main(String[] args) {
        System.out.println(movingCount(16, 8, 4));
    }

    public static int movingCount(int m, int n, int k) {
        int[][] test = new int[m][n];
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[0].length; j++) {
                test[i][j] = 0;
            }
        }
        int count =Count(0,0,m,n,k,test);
        int count1 = 0;
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[0].length; j++) {
                if(test[i][j] ==1){
                    count1++;
                }
            }
        }
        //System.out.println(count1);
        return count;
    }

    public static int Count(int i, int j, int m, int n, int k,int[][] test) {
        int count = 0;
        if (i < 0 || j < 0 || i >= m || j >= n || test[i][j] != 0) return 0;
        int a = i % 10;
        int b = i / 10;
        int c = j % 10;
        int d = j / 10;
        if (a + b + c + d <= k) {
            count++;
            test[i][j] = 1;
            count += Count(i + 1, j, m, n, k, test);
            count += Count(i, j + 1, m, n, k, test);
//            count += Count(i - 1, j, m, n, k, test);
//            count += Count(i, j - 1, m, n, k, test);
        }
        return count;
    }

}
