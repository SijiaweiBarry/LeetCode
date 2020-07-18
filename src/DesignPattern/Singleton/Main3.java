package DesignPattern.Singleton;

/**
 * @Author SijiaweiBarry
 * @create 2020/6/10 13:52
 */
public class Main3 {
    public int minKBitFlips(int[] A, int K) {
            int res = 0;
            for (int i = 0; i <A.length ; i++) {
            if (A[i]==0){
                if (i + K>A.length){
                    return -1;
                }
                res = res+1;
                for (int j = i; j <i+K ; j++) {
                    A[j] = A[j]^1;
                }
            }
        }
        return res;
    }
}



