package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/7 15:17
 */
public class T714买卖股票的最佳时机含手续费 {
    public int maxProfit(int[] prices, int fee) {
        if (prices.length==0)return 0;
        int n = prices.length;
        int [][]dp = new int[n][2];
        for (int i = 0; i <n ; i++) {
            if ((i-1)==-1){
                dp[i][0] = 0;
                dp[i][1] = -prices[i]-fee;
                continue;
            }
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0]-prices[i]-fee);
        }
        return dp[n-1][0];
    }
}
