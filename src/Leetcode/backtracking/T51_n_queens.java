package Leetcode.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/1 21:47
 */

/**
 * 51. N皇后
 * n 皇后问题研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
 *
 * 上图为 8 皇后问题的一种解法。
 *
 * 给定一个整数 n，返回所有不同的 n 皇后问题的解决方案。
 *
 * 每一种解法包含一个明确的 n 皇后问题的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。
 *
 * 示例:
 *
 * 输入: 4
 * 输出: [
 *  [".Q..",  // 解法 1
 *   "...Q",
 *   "Q...",
 *   "..Q."],
 *
 *  ["..Q.",  // 解法 2
 *   "Q...",
 *   "...Q",
 *   ".Q.."]
 * ]
 * 解释: 4 皇后问题存在两个不同的解法。 
 * 提示：
 * 皇后，是国际象棋中的棋子，意味着国王的妻子。皇后只做一件事，那就是“吃子”。当她遇见可以吃的棋子时，就迅速冲上去吃掉棋子。当然，她横、竖、斜都可走一到七步，可进可退。（引用自 百度百科 - 皇后 ）
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/n-queens
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T51_n_queens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        if (n==0){
            return ans;
        }
        HashSet<Integer>column = new HashSet<>();
        HashSet<Integer>master = new HashSet<>();
        HashSet<Integer>slave = new HashSet<>();
        Stack<Integer>stack = new Stack<>();
        int []nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i;
        }
        backTracking(n,nums,0,column,master,slave,stack,ans);
        return ans;
    }

    private void backTracking(int n, int[] nums, int row, HashSet<Integer> column, HashSet<Integer> master, HashSet<Integer> slave, Stack<Integer> stack, List<List<String>> ans) {
        if (n==row){
            List<String>list = convert2board(stack,n);
            ans.add(list);
            return;
        }
        //尝试每一列，看是否可以放入
        for (int i = 0; i < n; i++) {
            if (!column.contains(i)&&!master.contains(i+row)&&!slave.contains(i-row)){
                stack.add(nums[i]);
                column.add(i);
                master.add(i+row);
                slave.add(i-row);

            backTracking(n,nums,row+1,column,master,slave,stack,ans);
            stack.pop();
            column.remove(i);
            master.remove(i+row);
            slave.remove(i-row);
            }
        }
    }

    private List<String> convert2board(Stack<Integer> stack, int n) {
        List<String>list = new ArrayList<>();
        for (Integer integer : stack) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < n ; i++) {
                stringBuilder.append(".");
            }
            stringBuilder.replace(integer,integer+1,"Q");
            list.add(stringBuilder.toString());
        }
        return list;
    }
}
