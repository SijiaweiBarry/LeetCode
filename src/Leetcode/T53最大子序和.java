package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/5/19 22:10
 */
public class T53最大子序和 {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int dp [] = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i <nums.length ; i++) {
            dp[i] = dp[i-1]>0?dp[i-1]+nums[i]:nums[i];
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
