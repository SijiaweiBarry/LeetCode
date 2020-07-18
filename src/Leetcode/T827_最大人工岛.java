package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/21 14:56
 */

import java.util.HashSet;
import java.util.Set;

/**827. 最大人工岛
 * 在二维地图上， 0代表海洋， 1代表陆地，我们最多只能将一格 0 海洋变成 1变成陆地。
 *
 * 进行填海之后，地图上最大的岛屿面积是多少？（上、下、左、右四个方向相连的 1 可形成岛屿）
 *
 * 示例 1:
 *
 * 输入: [[1, 0], [0, 1]]
 * 输出: 3
 * 解释: 将一格0变成1，最终连通两个小岛得到面积为 3 的岛屿。
 * 示例 2:
 *
 * 输入: [[1, 1], [1, 0]]
 * 输出: 4
 * 解释: 将一格0变成1，岛屿的面积扩大为 4。
 * 示例 3:
 *
 * 输入: [[1, 1], [1, 1]]
 * 输出: 4
 * 解释: 没有0可以让我们变成1，面积依然为 4。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/making-a-large-island
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T827_最大人工岛 {
    int curArea = 0;
    public int largestIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int index = 2;int maxArea = 0;
        int []area = new int[100];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                curArea = 0;
                dfs(grid,i,j,index);
                if (curArea != 0) {
                    maxArea = Math.max(maxArea,curArea);
                    area[index++] = curArea;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j]==0){
                    maxArea = Math.max(maxArea,chageArea(grid,i,j,m,n,area));
                }
            }
        }
        return maxArea;
    }

    private int chageArea(int[][] grid, int i, int j, int m, int n, int[] area) {
        Set<Integer>areaSet = new HashSet<>();
        int areasize = 1;
        if (i-1>=0){
            areaSet.add(grid[i-1][j]);
        }
        if (j-1>=0){
            areaSet.add(grid[i][j-1]);
        }
        if (i+1<m){
            areaSet.add(grid[i+1][j]);
        }
        if (j+1<n){
            areaSet.add(grid[i][j+1]);
        }
        for (Integer integer : areaSet) {
            areasize+=area[integer];
        }
        return areasize;
    }

    private void dfs(int[][] grid, int i, int j, int index) {
        int m = grid.length;
        int n = grid[0].length;
        if (i>=m||j>=n||i<0||j<0||grid[i][j]!=1){
            return;
        }
        curArea++;
        grid[i][j] = index;
        dfs(grid,i+1,j,index);
        dfs(grid,i,j+1,index);
        dfs(grid,i-1,j,index);
        dfs(grid,i,j-1,index);
    }
}
