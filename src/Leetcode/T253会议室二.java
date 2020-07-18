package Leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/23 17:23
 */
public class T253会议室二 {
    public int minMeetingRooms(int[][] intervals) {
        int res = 0;
        if (intervals.length==0){
            return 0;
        }
        Arrays.sort(intervals, Comparator.comparingInt(o->o[0]));
        PriorityQueue<Integer> priorityQueue = new PriorityQueue();
        for (int i = 0; i <intervals.length ; i++) {
            priorityQueue.offer(intervals[i][1]);
            if (intervals[i][0] < priorityQueue.peek()){
                res++;
            }else {
                priorityQueue.poll();
            }
        }
        return res;
    }
}
