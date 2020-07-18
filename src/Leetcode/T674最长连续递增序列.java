package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/6/2 11:19
 */
public class T674最长连续递增序列 {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length==0||nums==null)return 0;
        int[]dp = new int[nums.length];
        dp[0] = 1;
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1]<nums[i]){
                dp[i] = dp[i-1] + 1;
            }else {
                dp[i] = 1;
            }
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
