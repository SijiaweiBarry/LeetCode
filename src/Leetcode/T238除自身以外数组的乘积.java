package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/17 13:03
 */
public class T238除自身以外数组的乘积 {
    public int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        int k = 1;
        for (int i = 0; i <nums.length ; i++) {
            res[i] = k;
            k = k * nums[i];
        }
         k = 1;
        for (int i = nums.length-1; i >=0 ; i--) {
            res[i] *=k;
            k = k * nums[i];
        }
        return res;
    }
}
