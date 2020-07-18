package Leetcode.strings;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/16 22:31
 */

/**91. 解码方法
 * 一条包含字母 A-Z 的消息通过以下方式进行了编码：
 *
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * 给定一个只包含数字的非空字符串，请计算解码方法的总数。
 *
 * 示例 1:
 *
 * 输入: "12"
 * 输出: 2
 * 解释: 它可以解码为 "AB"（1 2）或者 "L"（12）。
 * 示例 2:
 *
 * 输入: "226"
 * 输出: 3
 * 解释: 它可以解码为 "BZ" (2 26), "VF" (22 6), 或者 "BBF" (2 2 6) 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/decode-ways
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T91_decode_ways {
    public int numDecodings(String s) {
        if (s.length()==0||s.charAt(0)=='0'){return 0;}
        int[]dp = new int[s.length()];
        dp[0]=1;
        for (int i = 1; i <s.length() ; i++) {
            if (s.charAt(i)!='0'){
                dp[i] = dp[i-1];
            }
            if ((s.charAt(i-1)=='1')||(s.charAt(i-1)=='2'&&s.charAt(i)<'7')){
                if (i==1){
                    dp[i]++;
                }
                else {dp[i] +=dp[i-2];}
            }
        }
        return dp[s.length()-1];
    }
}
