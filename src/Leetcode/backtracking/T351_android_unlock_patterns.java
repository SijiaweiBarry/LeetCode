package Leetcode.backtracking;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/2 17:38
 */

/**
 * 351. 安卓系统手势解锁
 * 我们都知道安卓有个手势解锁的界面，是一个 3 x 3 的点所绘制出来的网格。
 *
 * 给你两个整数，分别为 ​​m 和 n，其中 1 ≤ m ≤ n ≤ 9，那么请你统计一下有多少种解锁手势，是至少需要经过 m 个点，但是最多经过不超过 n 个点的。
 *
 * 先来了解下什么是一个有效的安卓解锁手势:
 *
 * 每一个解锁手势必须至少经过 m 个点、最多经过 n 个点。
 * 解锁手势里不能设置经过重复的点。
 * 假如手势中有两个点是顺序经过的，那么这两个点的手势轨迹之间是绝对不能跨过任何未被经过的点。
 * 经过点的顺序不同则表示为不同的解锁手势。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/android-unlock-patterns
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T351_android_unlock_patterns {
    public int numberOfPatterns(int m, int n) {
        if (m==0||n==0||m>n){
            return 0;
        }
        int[][]skip = new int[10][10];
        skip[1][3] = skip[3][1] = 2;
        skip[4][6] = skip[6][4] = skip[2][8] = skip[8][2] = 5;
        skip[1][9] = skip[9][1] = skip[3][7] = skip[7][3] = 5;
        skip[7][9] = skip[9][7] = 8;
        skip[1][7] = skip[7][1] = 4;
        skip[3][9] = skip[9][3] = 6;
        boolean []visited = new boolean[10];
        int result = 0;
        for (int i = m; i <=n ; i++) {
            result += dfs(skip,visited,i-1,1)*4;
            result += dfs(skip,visited,i-1,2)*4;
            result += dfs(skip,visited,i-1,5);
        }
        return result;
    }

    private int dfs(int[][] skip, boolean[] visited, int remainNum, int current) {
        if (remainNum==0){
            return 1;
        }
        int res = 0;
        visited[current] = true;
        for (int i = 1; i <=9 ; i++) {
            int skipNum = skip[current][i];
            if (!visited[i]&&(skipNum==0||visited[skipNum])){
                res += dfs(skip,visited,remainNum-1,i);
            }
        }
        visited[current] = false;
        return res;
    }
}
