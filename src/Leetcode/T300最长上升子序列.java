package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/22 14:21
 */
public class T300最长上升子序列 {
    public int lengthOfLIS(int[] nums) {
        if (nums.length==0||nums.length==1)
            return nums.length;

        int res[] = new int[nums.length];
        int r = 0;
        res[0] = 1;
        for (int i = 1; i <nums.length ; i++) {
            int maxLength = 0;
            for (int j = 0; j <i ; j++) {
                if (nums[j]<nums[i]){
                    maxLength = Math.max(maxLength,res[j]);
                }
            }
            res[i] = maxLength + 1;
            r = Math.max(r,res[i]);
        }
        return r;
    }
}
