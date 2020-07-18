package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/3/6 22:15
 */
public class JT57和为s的连续正数序列 {
    public int[][] findContinuousSequence(int target) {
        List<int[]> res = new ArrayList<>();
            int i = 1;
            int j = 1;
            int sum = 0;
            while (i<=target){
                if (sum < target){
                    sum += j;
                    j++;
                }else if (sum > target){
                    sum -= i;
                    i++;
                }else {
                    int temp[] = new int[j-i+1];
                    for (int k = 0; k <temp.length ; k++) {
                        temp[k] = k+i;
                    }
                    res.add(temp);
                    sum-=i;
                    i++;
                }
            }
            return res.toArray(new int[res.size()][]);
    }
}
