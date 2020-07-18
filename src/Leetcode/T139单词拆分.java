package Leetcode;

import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/21 20:18
 */
public class T139单词拆分 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean []dp = new boolean[s.length()+1];
        dp[0] = true;
        for (int i = 1; i <=s.length() ; i++) {
            for (int j = 0; j <i ; j++) {
                if (dp[j]&&wordDict.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
