package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/25 9:19
 *
 * 329. 矩阵中的最长递增路径
 * 给定一个整数矩阵，找出最长递增路径的长度。
 *
 * 对于每个单元格，你可以往上，下，左，右四个方向移动。 你不能在对角线方向上移动或移动到边界外（即不允许环绕）。
 *
 * 示例 1:
 *
 * 输入: nums =
 * [
 *   [9,9,4],
 *   [6,6,8],
 *   [2,1,1]
 * ]
 * 输出: 4
 * 解释: 最长递增路径为 [1, 2, 6, 9]。
 * 示例 2:
 *
 * 输入: nums =
 * [
 *   [3,4,5],
 *   [3,2,6],
 *   [2,2,1]
 * ]
 * 输出: 4
 * 解释: 最长递增路径是 [3, 4, 5, 6]。注意不允许在对角线方向上移动。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-increasing-path-in-a-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T329_矩阵中的最长递增路径 {
    final int[][]direction = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix==null||matrix.length==0){
            return 0;
        }
        int ans = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int [][]visited = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j]==0){
                    ans = Math.max(ans,dfs(direction,matrix,i,j,m,n,visited));
                }
            }
        }
        return ans;
    }

    private int dfs(int[][] direction, int[][] matrix, int i, int j, int m, int n,int[][] visited) {
        if (i<0||i>=m||j<0||j>=n){
            return 0;
        }
        int max = 0;
        if (visited[i][j]>0){
            return visited[i][j];
        }
        for (int[] ints : direction) {
            int newX = i+ints[0];
            int newY = j+ints[1];
            if (newX>=0&&newX<m&&newY>=0&&newY<n&&matrix[newX][newY]>matrix[i][j]) {
                max = Math.max(max, dfs(direction, matrix, newX, newY, m, n, visited));

            }
        }
        visited[i][j] = max+1;
        return max+1;
    }

}
