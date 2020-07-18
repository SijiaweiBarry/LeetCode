package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 *输入: [1,2,3]
 * 输出:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 *
 *
 *
 */
public class T46全排列 {
    static List<List<Integer>>res = new ArrayList<>();
    public static List<List<Integer>> permute(int[] nums) {
        if (nums.length==0)return res;
        List<Integer>temp = new ArrayList<>();
        boolean b[] = new boolean[nums.length];
        Arrays.sort(nums);
        dfs(nums,temp,b,0);
        return res;
    }

    private static void dfs(int[] nums, List<Integer> temp, boolean[] b,int depth) {
        if (depth==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i <nums.length ; i++) {
            if (b[i]) {
                continue;
            }

            // 剪枝条件：i > 0 是为了保证 nums[i - 1] 有意义
            // 写 !used[i - 1] 是因为 nums[i - 1] 在深度优先遍历的过程中刚刚被撤销选择
            if (i > 0 && nums[i] == nums[i - 1] && !b[i - 1]) {
                continue;
            }


                b[i] = true;
                temp.add(nums[i]);
                dfs(nums,temp,b,depth+1);
                b[i] = false;
                temp.remove(temp.size()-1);

        }
    }

    public static void main(String[] args) {
        int[] nums = {1,1,3};
        List<List<Integer>>res= permute(nums);
        for (int i = 0; i < res.size(); i++) {
            List<Integer>l = res.get(i);
            for (Integer integer : l) {
                System.out.print(integer+",");
            }
            System.out.println();
        }
    }


//    List<List<Integer>> res = new ArrayList<>();
//    public List<List<Integer>> permute(int[] nums) {
//        if (nums==null){
//            return null;
//        }
//        Stack<Integer> stack = new Stack<>();
//        huisu(nums,stack);
//        return res;
//    }
//    public void huisu(int[]nums,Stack<Integer>stack){
//        if (stack.size()==nums.length){
//            res.add(new ArrayList<>(stack));
//            return;
//        }
//        for (int i = 0; i <nums.length ; i++) {
//            if (stack.contains(nums[i])){
//                continue;
//            }
//            stack.push(nums[i]);
//            huisu(nums,stack);
//            stack.pop();
//        }
//    }
}
