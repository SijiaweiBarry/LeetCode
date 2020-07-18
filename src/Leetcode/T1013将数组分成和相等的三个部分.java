package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/3/11 21:52
 */
public class T1013将数组分成和相等的三个部分 {
    public boolean canThreePartsEqualSum(int[] A) {
            int sum = 0;
        for (int i : A) {
            sum+=i;
        }
        if (sum%3!=0)return false;
        int temp = 0;
        int flag = 0;
        for (int i = 0; i <A.length ; i++) {
            temp += A[i];
            if (temp==sum/3){
                temp = 0;
                flag++;
            }
        }
        return flag>=3;
    }
}
