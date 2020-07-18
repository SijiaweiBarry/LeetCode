package Leetcode;

import java.util.*;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/19 16:50
 */
public class T347前K个高频元素 {
    public List<Integer> topKFrequent(int[] nums, int k) {
      List<Integer>res = new ArrayList<>();
      HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i <nums.length ; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i]) + 1);
            }else {
                map.put(nums[i],1);
            }
        }
        PriorityQueue<Integer> queue = new PriorityQueue((o1, o2) -> map.get(o1)-map.get(o2));
        for (Integer num:map.keySet()) {
            if (queue.size()<k){
            queue.add(num);
            }else {
                if (map.get(queue.peek())<map.get(num)){
                    queue.remove();
                    queue.add(num);
                }
            }
        }
        while (!queue.isEmpty()){
            res.add(queue.poll());
        }
        return res;
    }
}
