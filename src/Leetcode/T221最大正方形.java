package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/23 17:45
 */
public class T221最大正方形 {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length==0)
            return 0;
        int dp[][] = new int[matrix.length+1][matrix[0].length+1];
        int res = 0;
        for (int i = 1; i <=dp.length ; i++) {
            for (int j = 1; j <=dp[0].length ; j++) {
                if (matrix[i-1][j-1]=='1') {
                    dp[i][j] = Math.min(dp[i - 1][j],Math.min(dp[i - 1][j - 1], dp[i][j - 1])) + 1;
                    res = Math.max(res,dp[i][j]);
                }
            }
        }
        return res*res;
    }
}
