package Leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/19 19:39
 */
public class T56合并区间 {
    public int[][] merge(int[][] intervals) {
        LinkedList<int[]>linkedList = new LinkedList<>();
        if (intervals.length==0||intervals==null){return linkedList.toArray(new int[0][0]);}
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        for (int i = 0; i <intervals.length ; i++) {
            if (linkedList.isEmpty()||linkedList.getLast()[1]<intervals[i][0]){
                linkedList.addLast(intervals[i]);
            }else {
                linkedList.getLast()[1] = Math.max(linkedList.getLast()[1],intervals[i][1]);
            }
        }
        return linkedList.toArray(new int[0][0]);
    }
}
