package Leetcode;

import java.util.HashMap;

/**
 * @Author SijiaweiBarry
 * @create 2020/4/24 19:44
 */
public class J03数组中重复的数字 {
    public int findRepeatNumber(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if (map.containsKey(nums[i])){
                return nums[i];
            }else {
                map.put(nums[i],1);
            }
        }
        return 0;
    }
}
