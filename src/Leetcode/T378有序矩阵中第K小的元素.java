package Leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/17 22:50
 */
public class T378有序矩阵中第K小的元素 {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = matrix[0][0];
        int right = matrix[m-1][n-1];
        while (left<right){
            int mid = (left+right)/2;
            int count = lessThanMidNumCount(matrix,m,n,mid);
            if (count<k){
                left=mid+1;
            }else {
                right=mid;
            }
        }
        return left;
    }

    public int lessThanMidNumCount(int[][] matrix, int m, int n, int mid) {
        int i= m-1;
        int count = 0;
        int j=0;
        while (j<n&&i>=0){
            if (matrix[i][j]<=mid){
                count+=i+1;
                j++;
            }else {
                i--;
            }
        }
        return count;
    }
}
