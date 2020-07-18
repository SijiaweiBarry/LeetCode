package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/23 15:23
 */
public class T494目标和 {
    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        int target = S + sum;
        if (target % 2 == 1 || nums.length == 0 || sum < S) {
            return 0;
        }
        target = target / 2;
        int[] res = new int[target + 1];
        res[0] = 1;
        for (int num : nums) {
            for (int i = target; i >= num; i--) {
                res[i] += res[i - num];
            }
        }
        return res[target];
    }
}