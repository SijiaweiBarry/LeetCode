package Leetcode;

import java.util.HashMap;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/22 14:57
 */
public class T560和为K的子数组 {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int res = 0;
        map.put(0,1);
        int sum = 0;
        for (int i = 0; i <nums.length ; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                res += map.get(sum - k);
            }
        map.put(sum,map.getOrDefault(sum,0)+1);
    }
        return res;
    }
}
