package Leetcode;

import java.util.*;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/2 19:44
 */
public class T912排序树组 {
    public List<Integer> sortArray(int[] nums) {
        Integer num[] = new Integer[nums.length];
        for (int i = 0; i <num.length ; i++) {
            num[i] = nums[i];
        }
        List<Integer>list = new ArrayList<>();
        for (int i = 0; i <nums.length; i++) {
            list.add(nums[i]);
        }

        Collections.sort(list);
        return list;
    }
}
