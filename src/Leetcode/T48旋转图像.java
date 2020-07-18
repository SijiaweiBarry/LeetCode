package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/16 11:53
 */
public class T48旋转图像 {
    public void rotate(int[][] matrix) {
        //将矩阵转置
        int n = matrix.length;
        for (int i = 0; i < n ; i++) {
            for (int j = i; j < n ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //翻转列
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n/2 ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
    }
}
