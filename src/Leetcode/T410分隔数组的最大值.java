package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/3 11:15
 */
public class T410分隔数组的最大值 {
    public int splitArray(int[] nums, int m) {
        int right = 0;
        int left = 0;
        for (int i = 0; i <nums.length ; i++) {
            left = Math.max(left,nums[i]);
            right += nums[i];
        }
        while (left<right){
            int mid = (left+right)>>>1;
            int need = 1;
            int temp = 0;
            for (int i = 0; i <nums.length ; i++) {
                temp+=nums[i];
                if (temp > mid){
                    need++;
                    temp = nums[i];
                }
            }
            if (need>m) left=mid+1;
            if (need<=m)right = mid;
        }
        return left;
    }
}
