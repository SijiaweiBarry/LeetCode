package Leetcode;

import java.util.HashMap;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/21 11:44
 */
public class T1两数之和 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if (map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
