package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/7 14:19
 */
public class T123买卖股票的最佳时机3 {
    public int maxProfit(int[] prices) {
        if (prices.length==0)return 0;
        int n = prices.length;
        int K = 2;
        int dp[][][] = new int[n][3][2];
        for (int i = 0; i < n; i++) {
            for (int k = 1; k <=K ; k++) {
                if ((i-1)==-1){
                    dp[i][k][0] = 0;
                    dp[i][k][1] = -prices[i];
                    continue;
                }
                dp[i][k][0] = Math.max(dp[i-1][k][0],dp[i-1][k][1]+prices[i]);
                dp[i][k][1] = Math.max(dp[i-1][k][1],dp[i-1][k-1][0]-prices[i]);
            }
        }
        return dp[n-1][K][0];
    }
}
