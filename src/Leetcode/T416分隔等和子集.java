package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/23 15:06
 */
public class T416分隔等和子集 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i <nums.length ; i++) {
            sum += nums[i];
        }
        if (nums.length==0||sum%2==1){
            return false;
        }
        int target = sum/2;
        boolean res[] = new boolean[target+1];
        res[0] = true;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = target; j >=nums[i] ; j--) {
                if (res[j-nums[i]]){
                    res[j] = true;
                }
            }
        }
        return res[target];
    }
}
