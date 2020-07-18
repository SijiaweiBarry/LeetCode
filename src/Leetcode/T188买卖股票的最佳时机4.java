package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/7 14:56
 */
public class T188买卖股票的最佳时机4 {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (k<n/2)return maxProfit(prices);
        if (prices.length==0)return 0;
        int dp[][][] = new int[n][k+1][2];
        for (int i = 0; i <n ; i++) {
            for (int j = 1; j <=k ; j++) {
                if ((i-1)==-1){
                    dp[i][j][0] = 0;
                    dp[i][j][1] = -prices[i];
                    continue;
                }
                dp[i][j][0] = Math.max(dp[i-1][j][0],dp[i-1][j][1]+prices[i]);
                dp[i][j][1] = Math.max(dp[i-1][j][1],dp[i-1][j-1][0]-prices[i]);
            }
        }
        return dp[n-1][k][0];
    }
    public int maxProfit(int[] prices) {
        if (prices.length==0)return 0;
        int n = prices.length;
        int [][]dp = new int[n][2];
        for (int i = 0; i <n ; i++) {
            if ((i-1)==-1){
                dp[i][0] = 0;
                dp[i][1] = -prices[i];
                continue;
            }
            dp[i][0] = Math.max(dp[i-1][1]+prices[i],dp[i-1][0]);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
        }
        return dp[n-1][0];
    }
}
