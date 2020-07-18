package Leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import static java.util.Arrays.*;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/19 15:31
 */
public class T215数组中第K个最大元素 {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer>queue = new PriorityQueue<>(k);
        for (int i = 0; i <nums.length ; i++) {
            queue.offer(nums[i]);
//            if (queue.size()>k)queue.poll();
        }
        return queue.peek();
    }
}
