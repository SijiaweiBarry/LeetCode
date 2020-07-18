package Leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/2 18:08
 */

/**
 * 47. 全排列 II
 * 给定一个可包含重复数字的序列，返回所有不重复的全排列。
 *
 * 示例:
 *
 * 输入: [1,1,2]
 * 输出:
 * [
 *   [1,1,2],
 *   [1,2,1],
 *   [2,1,1]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/permutations-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T47_permutations_ii {
    List<List<Integer>>ans = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums.length==0||nums==null){
            return ans;
        }
        Arrays.sort(nums);
        int n = nums.length;
        Stack<Integer>path = new Stack<>();
        boolean[]visited = new boolean[n];
        backtracking(n,nums,visited,path,0);
        return ans;
    }

    private void backtracking(int n, int[] nums, boolean[] visited, Stack<Integer> path, int depth) {
        if (depth==n){
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i <n ; i++) {
            if (visited[i]||(i>=1&&nums[i]==nums[i-1]&&!visited[i])){
                continue;
            }
            visited[i]=true;
            path.push(nums[i]);
            backtracking(n,nums,visited,path,depth+1);
            path.pop();
            visited[i] = false;
        }
    }
}
