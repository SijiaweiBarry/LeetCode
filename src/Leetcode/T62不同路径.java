package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/20 22:29
 */
public class T62不同路径 {
    public int uniquePaths(int m, int n) {
        if (m==1&&n==1){
            return 1;
        }
        int [][]path = new int[m][n];
        for (int i = 1; i <m ; i++) {
            path[i][0] = 1;
        }
        for (int i = 1; i <n ; i++) {
            path[0][i] = 1;
        }
        for (int i = 1; i <m ; i++) {
            for (int j = 1; j <n ; j++) {
                path[i][j] = path[i-1][j] + path[i][j-1];
            }
        }
        return path[m-1][n-1];
    }
}
