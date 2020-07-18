package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/12 17:41
 */
public class T322零钱兑换 {
    public int coinChange(int[] coins, int amount) {
      int dp[] = new int[amount+1];
      dp[0] = 0;
        for (int i = 1; i <=amount ; i++) {
            int cost = Integer.MAX_VALUE;
            for (int j = 0; j <coins.length ; j++) {
                if (i-coins[j]>=0){
                    if (dp[i-coins[j]]!=Integer.MAX_VALUE){
                        cost = Math.min(cost,dp[i-coins[j]]+1);
                    }
                }
            }
            dp[i]=cost;
        }
        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }
}
