package Leetcode.backtracking;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/6 11:53
 */

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 90. 子集 II
 * 给定一个可能包含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 *
 * 说明：解集不能包含重复的子集。
 *
 * 示例:
 *
 * 输入: [1,2,2]
 * 输出:
 * [
 *   [2],
 *   [1],
 *   [1,2,2],
 *   [2,2],
 *   [1,2],
 *   []
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/subsets-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T90_subsets_ii {
    List<List<Integer>>ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if (nums.length==0||nums==null){
            return ans;
        }
        Arrays.sort(nums);
        List<Integer>path = new ArrayList<>();
        backTracking(nums,path,0);
        return ans;
    }

    private void backTracking(int[] nums, List<Integer> path, int start) {
        ans.add(new ArrayList<>(path));
        for (int i = start; i <nums.length ; i++) {
            if (i>start&&nums[i]==nums[i-1]){
                continue;
            }
            path.add(nums[i]);
            backTracking(nums,path,i+1);
            path.remove(path.size()-1);
        }
    }
}
