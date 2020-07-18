package Leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/2 16:42
 */

/** 77.组合
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 *
 * 示例:
 *
 * 输入: n = 4, k = 2
 * 输出:
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/combinations
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T77_combinations {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        //特判
        if (n<=0||k<=0||n<k){
            return ans;
        }
        backtracking(n,1,k,new Stack<Integer>());
        return ans;
    }

    private void backtracking(int n, int begin, int k, Stack<Integer> pre) {
        if (pre.size()==k){
            ans.add(new ArrayList<>(pre));
            return;
        }
        for (int i = begin; i <=n+1-(k-pre.size()) ; i++) {
            pre.push(i);
            backtracking(n,i+1,k,pre);
            pre.pop();
        }
    }
}
