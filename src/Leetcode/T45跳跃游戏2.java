package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/6/2 16:37
 */
public class T45跳跃游戏2 {
    public int jump(int[] nums) {
        int end = 0;
        int step = 0;
        int maxPosition = 0;
        for (int i = 0; i <nums.length-1 ; i++) {
            maxPosition = Math.max(maxPosition,i+nums[i]);
            if (end == i){
                end = maxPosition;
                step++;
            }
        }
        return step;
    }
}
