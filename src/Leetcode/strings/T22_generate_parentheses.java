package Leetcode.strings;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/16 22:20
 */

import java.util.ArrayList;
import java.util.List;

/**22. 括号生成
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 * 示例：
 *
 * 输入：n = 3
 * 输出：[
 *        "((()))",
 *        "(()())",
 *        "(())()",
 *        "()(())",
 *        "()()()"
 *      ]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/generate-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T22_generate_parentheses {
    List<String>ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        if (n==0){return ans;}
        StringBuilder path = new StringBuilder("");
        int left = 0;
        int right = 0;
        help(path,left,right,n);
        return ans;
    }

    private void help(StringBuilder path, int left, int right, int n) {
        if (left==n&&right==n){
            ans.add(path.toString());
            return;
        }
        if (left<n){
            path = path.append("(");
            help(path,left+1,right,n);
            path.deleteCharAt(path.length()-1);
        }
        if (right<n&&left>right){
            path = path.append(")");
            help(path,left,right+1,n);
            path.deleteCharAt(path.length()-1);
        }
    }

}
