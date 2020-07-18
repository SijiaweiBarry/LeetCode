package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/21 11:11
 */
public class T739每日温度 {
    public int[] dailyTemperatures(int[] T) {
        int res[] = new int[T.length];
        for (int i =res.length-2; i >=0 ; i--) {
            for (int j = i + 1; j <res.length ; j+=res[j]) {
                if (T[i]<T[j]){
                    res[i]=j-i;
                    break;
                }else if (res[j]==0){
                    res[i]=0;
                    break;
                }
            }
        }
        return res;
    }
}
