
package Leetcode;

import java.util.Arrays;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/19 0:16
 */
public class T174_地下城游戏 {
    public static int calculateMinimumHP(int[][] dungeon) {
       int n = dungeon.length;
       int m = dungeon[0].length;
       int [][]dp = new int[n+1][m+1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        for (int i = 0; i < dp.length; i++) {
            for (int i1 : dp[i]) {
                System.out.print(i1+",");
            }
            System.out.println();
        }
        dp[n][m-1] = dp[n-1][m] = 1;
        for (int i = n-1; i >=0 ; i--) {
            for (int j = m-1; j >=0 ; j--) {
                dp[i][j] = Math.max(1,Math.min(dp[i][j+1],dp[i+1][j])-dungeon[i][j]);
            }
        }
        return dp[0][0];
    }
}
