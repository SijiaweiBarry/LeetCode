package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/4/25 19:53
 */
public class T204计数质数 {
    public static int countPrimes(int n) {
        boolean []b = new boolean[n+1];
        for (int i = 0; i <n ; i++) {
            b[i] = true;
        }
        if (n<2)return 0;
        for (int i = 2; i*i <=n ; i++) {
            if (b[i]){
                for (int j = i; j <=n/i ; j++) {
                    b[i*j] = false;
                }
            }
        }
        int res = 0;
        for (int i = 2; i <n ; i++) {
            if (b[i]){
                res++;
            };
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}
