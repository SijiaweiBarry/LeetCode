package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/7 15:34
 */
public class T309买卖股票的最佳时机含冷冻期 {
    public int maxProfit(int[] prices) {
        if (prices.length==0)return 0;
        int n = prices.length;
        int dp_0=0;int dp_1 = Integer.MIN_VALUE;
        int pre = 0;
        for (int i = 0; i <n ; i++) {
            int temp = dp_0;
            dp_0 = Math.max(dp_0,dp_1+prices[i]);
            dp_1 = Math.max(dp_1,pre-prices[i]);
            pre = temp;
        }
        return dp_0;
    }
}
