package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/28 20:02
 */
public class T55跳跃游戏 {
    public boolean canJump(int[] nums) {
        if (nums.length==0)return false;
        if (nums.length==1)return true;
        int k = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i>k){return false;}
            k = Math.max(k,i+nums[i]);
        }
        return true;
    }
}
