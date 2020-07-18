package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/17 17:22
 */
public class T287寻找重复数 {
    public int findDuplicate(int[] nums) {
        Map map =new HashMap();
        for (int i = 0; i <nums.length ; i++) {
            if (map.containsKey(nums[i])){
                return nums[i];
            }
            map.put(nums[i],1);
        }
        return 0;
    }
}
