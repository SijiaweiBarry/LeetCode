package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/16 10:48
 */
public class T39组合总和 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer>list = new ArrayList<>();
        combination(0,candidates,target,list);
        return res;
    }
    public void combination(int start,int[]candidates,int target,List<Integer>list){
        if (target<0){
            return;
        }
        if (target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        if (target>0){
            for (int i = start; i <candidates.length ; i++) {
                list.add(candidates[i]);
                combination(i,candidates,target-candidates[i],list);
                list.remove(list.size()-1);
            }
        }

    }
}
