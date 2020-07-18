package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/10 20:03
 */

/**
 * 编写一个程序，通过已填充的空格来解决数独问题。
 *
 * 一个数独的解法需遵循如下规则：
 *
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 * 空白格用 '.' 表示。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sudoku-solver
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T37_解数独 {
    public void solveSudoku(char[][] board) {
        boolean[][]rowUsed = new boolean[9][10];
        boolean[][]culUsed = new boolean[9][10];
        boolean[][][]boxUsed = new boolean[3][3][10];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]<='9'&&board[i][j]>='1'){
                    rowUsed[i][board[i][j]-'0'] = true;
                    culUsed[j][board[i][j]-'0'] = true;
                    boxUsed[i/3][j/3][board[i][j]-'0'] = true;
                }
            }
        }
        backTracking(board,rowUsed,culUsed,boxUsed,0,0);
    }

    private boolean backTracking(char[][] board, boolean[][] rowUsed, boolean[][] culUsed, boolean[][][] boxUsed, int row, int cul) {
        if (cul==board[0].length){
            cul=0;
            row++;
            if (row==board.length){
                return true;
            }
        }
        if (board[row][cul]=='.'){
            for (int i = 1; i <=9 ; i++) {
                boolean b = !(rowUsed[row][i]||culUsed[cul][i]||boxUsed[row/3][cul/3][i]);
                if (b){
                    board[row][cul] = (char)('0'+i);
                    rowUsed[row][i] = true;
                    culUsed[cul][i] = true;
                    boxUsed[row/3][cul/3][i] = true;
                    if (backTracking(board,rowUsed,culUsed,boxUsed,row,cul+1)){
                        return true;
                    }
                    board[row][cul] = '.';
                    rowUsed[row][i] = false;
                    culUsed[cul][i] = false;
                    boxUsed[row/3][cul/3][i] = false;
                }
            }
        }else {
            return backTracking(board,rowUsed,culUsed,boxUsed,row,cul+1);
        }
        return false;
    }
}
