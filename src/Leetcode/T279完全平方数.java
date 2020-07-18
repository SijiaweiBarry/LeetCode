package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/21 20:07
 */
public class T279完全平方数 {
    public int numSquares(int n) {
        int temp[] = new int[n+1];
        for (int i = 1; i <temp.length ; i++) {
            temp[i]=i;
            for (int j = 1; i-j*j>=0 ; j++) {
                temp[i] = Math.min(temp[i],temp[i-j*j]+1);
            }
        }
        return temp[n];
    }
}
