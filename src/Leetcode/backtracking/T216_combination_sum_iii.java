package Leetcode.backtracking;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/2 22:24
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 216. 组合总和 III
 * 找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。
 *
 * 说明：
 *
 * 所有数字都是正整数。
 * 解集不能包含重复的组合。 
 * 示例 1:
 *
 * 输入: k = 3, n = 7
 * 输出: [[1,2,4]]
 * 示例 2:
 *
 * 输入: k = 3, n = 9
 * 输出: [[1,2,6], [1,3,5], [2,3,4]]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/combination-sum-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T216_combination_sum_iii {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        if (n<=0||k<=0||k>=n){
            return ans;
        }
        Deque<Integer>path = new ArrayDeque<>();
        backtracking(n,k,1,path);
        return ans;
    }

    private void backtracking(int remainSum, int remainN, int start, Deque<Integer> path) {
        if (remainSum<0){
            return;
        }
        if (remainSum==0&&remainN==0){
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i <10 ; i++) {
            path.addLast(i);
            backtracking(remainSum-i,remainN-1,i+1,path);
            path.removeLast();
        }

    }
}
