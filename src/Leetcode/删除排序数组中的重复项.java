package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/5/1 21:49
 */
public class 删除排序数组中的重复项 {
    public static int removeDuplicates(int[] nums){
        int res = 1;
        for (int i = 1; i <nums.length ; i++) {
            if (nums[i-1]==nums[i]){
                continue;
            }else {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int []nums = {1,2,2,3,4,5,5,5,6,9,9};
        System.out.println(removeDuplicates(nums));
    }
}
