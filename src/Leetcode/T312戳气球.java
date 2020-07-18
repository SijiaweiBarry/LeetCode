package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/13 19:01
 */
public class T312戳气球 {
    public int maxCoins(int[] nums) {
        int nums1[] = new int[nums.length+2];
        nums1[0] = 1;nums1[nums1.length-1] = 1;
        for (int i = 1; i <nums1.length-1 ; i++) {
            nums1[i] = nums[i-1];
        }
        int dp[][] = new int[nums1.length][nums1.length];
        for (int i = 2; i <nums1.length ; i++) {
            for (int j = 0; j <nums1.length-i ; j++) {
                int k = j+i;
                for (int l = j+1; l <k ; l++) {
                    dp[j][k] = Math.max(dp[j][k],dp[j][l]+dp[l][k]+nums1[j]*nums1[l]*nums1[k]);
                }
            }
        }
        return dp[0][nums1.length-1];
    }
}
