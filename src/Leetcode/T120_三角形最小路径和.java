package Leetcode;

import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/17 22:17
 */
public class T120_三角形最小路径和 {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle==null){return 0;}
        int[][]dp = new int[triangle.size()+1][triangle.get(triangle.size()-1).size()+1];
        for (int i = triangle.size()-1; i >=0 ; i--) {
            for (int j = 0; j <triangle.get(i).size() ; j++) {
                dp[i][j] = triangle.get(i).get(j)+Math.min(dp[i+1][j+1],dp[i+1][j]);
            }
        }
        return dp[0][0];
    }
}
