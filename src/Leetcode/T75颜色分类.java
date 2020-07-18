package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/21 12:05
 */
public class T75颜色分类 {
    public void sortColors(int[] nums) {
        int cur = 0;
        int p0 = 0;
        int p2 = nums.length-1;
        int temp;
        while (cur<=p2){
            if (nums[cur]==0){
                temp = nums[cur];
                nums[cur++] = nums[p0];
                nums[p0++] = temp;
            }else if (nums[cur]==2){
                temp = nums[cur];
                nums[cur] = nums[p2];
                nums[p2--] = temp;
            }else {
                cur++;
            }
        }
    }
}
