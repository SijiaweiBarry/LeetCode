package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/1 18:12
 */
public class T1043分隔数组以得到最大和 {
    public static int maxSumAfterPartitioning(int[] A, int K) {
        int[] res =new int[A.length];
        for(int i = 0; i < A.length; i++){
            int max = A[i];
            for(int j = 1; j <= K && i-j+1 >= 0; j++){
                max = Math.max(max,A[i-j+1]);
                res[i] = Math.max(res[i], ((i-j < 0) ? 0 : res[i-j]) + j * max);
            }
        }
        return res[A.length - 1];
    }

    public static void main(String[] args) {
        int[]A = new int[]{1};
        int K =1;
        maxSumAfterPartitioning(A,K);

    }
}
