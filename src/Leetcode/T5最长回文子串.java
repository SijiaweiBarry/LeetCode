package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/2 11:56
 */
public class T5最长回文子串 {
    public String longestPalindrome(String s) {
        int length = s.length();
        String res = "";
        boolean dp[][] = new boolean[length][length];
        for (int len = 1; len <=length ; len++) {
            for (int start = 0; start < length ; start++) {
                int end = start + len -1;
                if (end >= length){
                    break;
                }
                dp[start][end] = (len==1||len==2||dp[start+1][end-1])&&(s.charAt(start)==s.charAt(end));
                if (dp[start][end]&&len>res.length()){
                    res = s.substring(start,end+1);
                }
            }
        }
        return res;
    }
}
