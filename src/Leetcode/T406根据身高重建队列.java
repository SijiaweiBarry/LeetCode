package Leetcode;

import java.util.*;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/19 13:27
 */
public class T406根据身高重建队列 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]==o2[0]?o1[1]-o2[1]:o2[0]-o1[0];
            }
        });
        List<int[]> res = new LinkedList<>();
        for (int i = 0; i <people.length ; i++) {
            res.add(people[i][1],people[i]);
        }
        int n = people.length;
        return res.toArray(new int[n][2]);
    }
}
