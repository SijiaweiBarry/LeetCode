package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/26 20:40
 */
public class T240搜索二维矩阵二 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length==0||matrix[0].length==0){
            return false;
        }
        int i = matrix.length-1;
        int j = 0;
        while (i<matrix.length&&j<matrix[0].length){
            if (matrix[i][j]<target){
                j++;
            }else if (matrix[i][j]>target){
                i--;
            }else if (matrix[i][j]==target){
                return true;
            }
        }
        return false;
    }
}
