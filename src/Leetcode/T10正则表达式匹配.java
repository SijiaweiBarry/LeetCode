package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/5/20 20:22
 */
public class T10正则表达式匹配 {
    public boolean isMatch(String s, String p) {
        int slength = s.length();
        int plength = p.length();
        boolean[][]dp = new boolean[slength+1][plength+1];
        dp[0][0] = true;
        for (int i = 2; i <plength+1 ; i++) {
            if (p.charAt(i-1)=='*')
                dp[0][i] = dp[0][i-2];
        }
        for (int i = 1; i <slength+1 ; i++) {
            for (int j = 1; j <plength+1 ; j++) {
                int m = i-1,n = j-1;
                if (p.charAt(n)=='*'){
                    dp[i][j] = dp[i][j-2]||((s.charAt(m)==p.charAt(n-1)||p.charAt(n-1)=='.')&&dp[i-1][j]);
                }else {
                    dp[i][j] = (s.charAt(m)==p.charAt(n)||p.charAt(n)=='.')&&dp[i-1][j-1];
                }
            }
        }
        return dp[slength][plength];
    }
}
