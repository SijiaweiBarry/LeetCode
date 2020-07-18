package Leetcode;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Stack;

/**
 * @Author SijiaweiBarry
 * @create 2020/6/2 11:06
 */
public class test {
    public int numIslands(char[][] grid) {
        if (grid==null||grid.length==0)return 0;
        int res = 0;
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                if (grid[i][j]=='1'){
                    res++;
                    help(grid,i,j);
                }
            }
        }
        return res;
    }

    private void help(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        if (i<0||j<0||i>=m||j>=n||grid[i][j]=='0'){
            return;
        }
        grid[i][j] = '0';
        help(grid,i+1,j);
        help(grid,i-1,j);
        help(grid,i,j+1);
        help(grid,i,j-1);
    }


    public static void main(String[] args) {
        String s = "abbc";
        System.out.println((s));
    }
}
