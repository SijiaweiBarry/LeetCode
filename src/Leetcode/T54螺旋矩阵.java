package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/17 21:01
 */
public class T54螺旋矩阵 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>list = new ArrayList<>();
        if (matrix==null||matrix.length==0){
            return list;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int q = (Math.min(m,n)+1)/2;
        int i=0;
        while(i<q){
            //第i圈，从左往右
            for (int j = i; j <=n-1-i ; j++) {
                list.add(matrix[i][j]);
            }
            //第i圈，从上到下
            for (int j = i+1; j <=m-1-i ; j++) {
                list.add(matrix[j][n-1-i]);
            }
            //第i圈，从右到左
            for (int j = n-i-2; j >=i&&(m-1-i)!=i ; j--) {
                list.add(matrix[m-1-i][j]);
            }
            //第i圈，从下到上
            for (int j = m-2-i; j >=i+1&&(n-1-i)!=i ; j--) {
                list.add(matrix[j][i]);
            }
            i++;
        }
        return list;
    }
}
