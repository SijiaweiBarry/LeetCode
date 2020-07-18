package Leetcode.strings;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/16 15:39
 */

/**
 * 5.最长回文子串
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 示例 1：
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 *
 * 输入: "cbbd"
 * 输出: "bb"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T5_longest_palindromic_substring {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        boolean [][]dp = new boolean[chars.length][chars.length];
        int maxLength = 0;
        String ans = "";
        for (int len = 1; len <=s.length() ; len++) {
            for (int start = 0; start < chars.length; start++) {
                int end = start + len -1;
                if (end>=chars.length){
                    break;
                }
                dp[start][end] = (len==1)||(chars[start]==chars[end]&&(dp[start+1][end-1]||len==2));
                if (dp[start][end]){
                    if (len>maxLength){
                        maxLength = len;
                        ans = s.substring(start,start+len);
                    }
                }
            }
        }
        return ans;
    }
}
