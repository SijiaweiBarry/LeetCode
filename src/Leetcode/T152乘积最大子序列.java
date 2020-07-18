package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/30 14:19
 */
public class T152乘积最大子序列 {
    public int maxProduct(int[] nums) {
        if (nums.length==0)
            return 0;
        if (nums.length==1)
            return nums[0];
        int maxdp[] =new int[nums.length];
        int mindp[] = new int[nums.length];
        maxdp[0] = nums[0];
        mindp[0] = nums[0];
        int res = nums[0];
        for (int i = 1; i <nums.length ; i++) {
            maxdp[i] = Math.max(mindp[i-1]*nums[i],Math.max(nums[i],maxdp[i-1]*nums[i]));
            mindp[i] = Math.min(mindp[i-1]*nums[i],Math.min(nums[i],maxdp[i-1]*nums[i]));
            res = Math.max(res,maxdp[i]);
        }
        return res;
    }
}
