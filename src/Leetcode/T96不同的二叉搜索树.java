package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/29 13:59
 */
public class T96不同的二叉搜索树 {
    public int numTrees(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <dp.length ; i++) {
            for (int j = 1; j < i + 1 ; j++) {
                dp[i] += dp[j-1] * dp[i-j];
            }
        }
        return dp[n];
    }
}
