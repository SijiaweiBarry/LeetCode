package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/29 19:33
 */
public class T415字符串相加 {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;
        int cur = 0;
        while (i >= 0||j >= 0){
            int n1 = i>=0?num1.charAt(i)-'0':0;
            int n2 = j>=0?num2.charAt(j)-'0':0;
            int res = n1+n2+cur;
            cur = res/10;
            int r = res%10;
            sb.append(r);
            i--;
            j--;
        }
        if (cur==1){
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}
