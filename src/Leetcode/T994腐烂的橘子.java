package Leetcode;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author SijiaweiBarry
 * @create 2020/3/4 21:47
 */
public class T994腐烂的橘子 {
    public int orangesRotting(int[][] grid) {
        if (grid.length==0||grid==null){return -1;}
        int count = 0;
        Queue<int[]>queue = new LinkedList<>();
        int M = grid.length;
        int N = grid[0].length;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 1){
                    count++;
                }
                if (grid[i][j] == 2){
                    queue.add(new int[]{i,j});
                }
            }
        }
        int res = 0;
        while (count>0&&!queue.isEmpty()) {
            res++;
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                int[] temp = queue.poll();
                int a = temp[0];
                int b = temp[1];
                if (a-1>=0&&grid[a - 1][b] == 1) {
                    grid[a-1][b] = 2;
                    queue.add(new int[]{a - 1, b});
                    count--;
                }
                if (a+1<M&&grid[a + 1][b] == 1) {
                    grid[a+1][b] = 2;
                    queue.add(new int[]{a + 1, b});
                    count--;
                }
                if (b-1>=0&&grid[a][b - 1] == 1) {
                    grid[a][b-1] = 2;
                    queue.add(new int[]{a, b - 1});
                    count--;
                }
                if (b+1<N&&grid[a][b + 1] == 1) {
                    grid[a][b+1] = 2;
                    queue.add(new int[]{a, b + 1});
                    count--;
                }
            }
        }
        if (count>0){
            return -1;
        }else {
            return res;
        }
    }
}
