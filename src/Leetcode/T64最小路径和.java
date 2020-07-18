package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/17 13:12
 * 与原题稍有不同！
 */
public class T64最小路径和 {
    public static int[][]minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][]res = new int[m][n];
        res[0][0] = grid[0][0];
        for (int i = 1; i <m ; i++) {
            res[i][0] = res[i-1][0]+grid[i][0];
        }
        for (int i = 1; i <n ; i++) {
            res[0][i] = res[0][i-1]+grid[0][i];
        }
        for (int i = 1; i <m ; i++) {
            for (int j = 1; j < n; j++) {
                res[i][j] = Math.min(res[i-1][j],res[i][j-1])+grid[i][j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int grid[][]={{1,3,1},{1,5,1},{4,2,1}};
        int res[][] = minPathSum(grid);
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
