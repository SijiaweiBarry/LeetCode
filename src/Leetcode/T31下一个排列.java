package Leetcode;

import java.util.Arrays;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/28 21:01
 */
public class T31下一个排列 {
    public void nextPermutation(int[] nums) {
        int first = -1;
        for (int i = nums.length-2; i >=0 ; i--) {
            if (nums[i]<nums[i+1]){
                first = i;
                break;
            }
        }
        if (first==-1){
            Arrays.sort(nums);
        }else {
            int second = -1;
            for (int i = nums.length-1; i >first ; i--) {
                if (nums[first]<nums[i]){
                    second = i;
                    break;
                }
            }
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
            Arrays.sort(nums,first+1,nums.length);
        }
    }
}
