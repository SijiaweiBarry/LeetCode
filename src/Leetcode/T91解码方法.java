package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/18 17:49
 */
public class T91解码方法 {
    public static int numDecodings(String s) {
        if (s.charAt(0)=='0')return 0;
        int dp[] = new int[s.length()+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <=s.length() ; i++) {
            if (s.charAt(i-1)!='0'){

                dp[i]+=dp[i-1];
            }
            if ((s.charAt(i-2)=='1'||s.charAt(i-2)=='2')&&(s.charAt(i-1)<'7')){
                dp[i]+=dp[i-2];
            }
        }
        System.out.println(dp[0]+" "+dp[1]);
        System.out.println(dp[2]);;
        return dp[s.length()];
    }

    public static void main(String[] args) {
        String s="12";
        System.out.println(numDecodings(s));
    }
}
