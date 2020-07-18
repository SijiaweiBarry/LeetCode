package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/12 17:25
 */
public class T15三数之和 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>res = new ArrayList<>();
        if (nums==null||nums.length<3)return res;
        Arrays.sort(nums);
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]>0)return res;
            if (i>0&&nums[i]==nums[i-1])continue;
            int L = i+1;
            int R = nums.length-1;
            while (L<R){
                if (nums[i]+nums[L]+nums[R]==0){
                    res.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L<R&&nums[L]==nums[L+1])L++;
                    while (L<R&&nums[R]==nums[R-1])R--;
                    L++;
                    R--;
                }else if (nums[i]+nums[L]+nums[R]<0){
                    L++;
                }else if (nums[i]+nums[L]+nums[R]>0){
                    R--;
                }
            }
        }
        return res;
    }
}
