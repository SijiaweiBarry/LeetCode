package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/4/26 17:09
 */
public class T50快速幂 {
    public double myPow(double x, int n) {
        double ans = 1;
        int temp = Math.abs(n);
        while (temp>0){
            if ((temp&1)==1){
                ans*=x;
            }
            x*=x;
            temp>>=1;
        }
        return n>0?ans:1/ans;
    }
}
