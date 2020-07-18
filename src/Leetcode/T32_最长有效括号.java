package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/8 23:17
 */

import java.util.ArrayDeque;
import java.util.Deque;

/**32. 最长有效括号
 * 给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。
 *
 * 示例 1:
 *
 * 输入: "(()"
 * 输出: 2
 * 解释: 最长有效括号子串为 "()"
 * 示例 2:
 *
 * 输入: ")()())"
 * 输出: 4
 * 解释: 最长有效括号子串为 "()()"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T32_最长有效括号 {
    public int longestValidParentheses(String s) {
        if (s==null){
            return 0;
        }
        Deque<Integer>stack = new ArrayDeque<>();
        stack.push(-1);
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='('){
                stack.push(i);
            }else {
                stack.pop();
                if (stack.isEmpty()){
                    stack.push(i);
                }
                ans = Math.max(ans,i-stack.peek());
            }
        }
        return ans;
    }
}
