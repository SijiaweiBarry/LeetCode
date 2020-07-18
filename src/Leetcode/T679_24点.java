package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/9/16 19:13
 */
public class T679_24点 {
    List<List<Integer>>list = new ArrayList<>();
    public boolean judgePoint24(int[] nums) {
        boolean[]used = new boolean[nums.length];
        Arrays.sort(nums);
        backTracking(nums,used,0,new ArrayList<Integer>());
        for (List<Integer> integers : list) {
            if (judge(integers.get(0).doubleValue(),integers.get(1).doubleValue(),integers.get(2).doubleValue(),integers.get(3).doubleValue())){
                return true;
            }
        }
        return false;
    }

    private void backTracking(int[] nums, boolean[] used, int index, ArrayList<Integer> temp) {
        if (index==nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            if (used[i]){
                continue;
            }
            if (i>0&&nums[i]==nums[i-1]&&!used[i-1]){
                continue;
            }
            temp.add(nums[i]);
            used[i] = true;
            backTracking(nums,used,index+1,temp);
            used[i] = false;
            temp.remove(temp.size()-1);
        }
    }

    private boolean judge(Double a, Double b, Double c, Double d) {
        return judge(a+b,c,d)||judge(a-b,c,d)||judge(a*b,c,d)||((b!=0)&&(judge(a/b,c,d)));
    }

    private boolean judge(Double a, Double c, Double d) {
        return judge(a+c,d)||judge(a-c,d)||judge(a*c,d)||((c!=0)&&(judge(a/c,d)))||judge(c-a,d)||((a!=0)&&(judge(c/a,d)))||judge(a,c+d)||judge(a,c-d)||judge(a,c/d)||judge(a,c*d);
    }

    private boolean judge(Double a, Double b) {
        return Math.abs(a + b - 24) < 0.001 ||
                Math.abs(a - b - 24) < 0.001 ||
                Math.abs(a * b - 24) < 0.001 ||
                Math.abs(a / b - 24) < 0.001 ||
                Math.abs(b - a - 24) < 0.001 ||
                Math.abs(b / a - 24) < 0.001;


    }
}
