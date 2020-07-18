package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/5/12 15:57
 */
public class T79单词搜索 {
    public static int[][]direction = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    public static boolean[][]marked ;
    int m;int n;
    String word;
    char[][]board;
    public boolean exist(char[][] board, String word) {
         m = board.length;
        if (m==0)return false;
         n = board[0].length;
         this.word = word;
         this.board = board;
        marked = new boolean[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if (dfs(i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, int start) {
        if (start==word.length()-1){
            return board[i][j] == word.charAt(word.length()-1);
        }
        if (board[i][j] == word.charAt(start)){
            marked[i][j]=true;
            for (int k = 0; k <4 ; k++) {
                int newX = i+direction[k][0];
                int newY = j+direction[k][1];
                if (inArea(newX,newY)&&!marked[newX][newY]){
                    if (dfs(newX,newY,start+1)){
                        return true;
                    }
                }
            }
            marked[i][j] = false;
        }
        return false;
    }

    private boolean inArea(int newX, int newY) {
        return newX>=0&&newX<m&&newY>=0&&newY<n;
    }
}
