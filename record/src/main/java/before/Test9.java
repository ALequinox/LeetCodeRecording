package before;

public class Test9 {
    /*
    剑指 Offer 12. 矩阵中的路径
    给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。

    单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。



    例如，在下面的 3×4 的矩阵中包含单词 "ABCCED"（单词中的字母已标出）

    解题方法使用深度优先遍历的方式暴力遍历矩阵，先对一个方向进行递归搜索到底，再回溯到上一个节点搜索，直到完成或者结束。
     */
    public static void main(String[] args) {
        char[][] boards = {{'A', 'B', 'C', 'E'},
                            {'S', 'F', 'C', 'S'},
                            {'A', 'D', 'E', 'E'}};
        System.out.println(exist(boards, "BFAD"));

    }


    private static boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (DFS(board,i,j,0,chars)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean DFS(char[][] board,int i,int j,int k,char[] chars){
        if(i<0 || i >= board.length|| j<0 || j>=board[0].length||chars[k] != board[i][j]) return false;
        if(k == chars.length-1) return true;
        boolean result ;
        board[i][j] = '\0';
        result = DFS(board,i+1,j,k+1,chars) || DFS(board,i,j+1,k+1,chars) ||
                DFS(board,i-1,j,k+1,chars) || DFS(board,i,j-1,k+1,chars);
        board[i][j] = chars[k];
        return result;
    }
}
