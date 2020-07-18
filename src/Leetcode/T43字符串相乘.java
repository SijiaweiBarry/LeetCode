package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/2 20:01
 */
public class T43字符串相乘 {
    public String multiply(String num1, String num2) {
        if (num1.equals("0")||num2.equals("0")){
            return "0";
        }
        int length1 = num1.length();
        int length2 = num2.length();
       int []n1 = new int[length1];
       int []n2 = new int[length2];
        for (int i = 0; i <length1 ; i++) {
            n1[i] = num1.charAt(i) - 48;
        }
        for (int i = 0; i <length2 ; i++) {
            n2[i] = num2.charAt(i) - 48;
        }
        int res[] = new int[length1+length2+1];
        int temp = 0;
        int extra = 0;
        int m = 0;
        for (int i = length1-1; i >=0; i--) {
            for (int j = length2-1; j >=0 ; j--) {
                temp = n1[i] * n2[j];
                m = length1-1-i + length2-1-j;
                res[m] += temp;
                while (res[m]>=10){
                    extra = res[m]/10;
                    res[m] = res[m]%10;
                    m++;
                    res[m]+=extra;
                }
            }
        }
        StringBuffer r = new StringBuffer();
        for (int i = m; i >=0 ; i--) {
            r.append(res[i]);
        }
        return r.toString();
    }
}
