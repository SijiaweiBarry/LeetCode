package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class T78子集 {
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        int n = 1 << nums.length;
        for (int i = 0; i < n; i++) {
            List<Integer>cur=new ArrayList<>();
            for (int j = 0; j <nums.length ; j++) {
                if (((i>>j)&1)==1){
                    cur.add(nums[j]);
                }
            }
            res.add(cur);
        }
        return res;
    }
}
