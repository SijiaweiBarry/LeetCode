package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/28 15:46
 */
public class T67二进制求和 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int jin = 0;
        for (int i = a.length()-1,j=b.length()-1; i >=0||j>=0 ; i--,j--) {
            int sum = jin;
            sum += i>=0?a.charAt(i)-'0':0;
            sum += j>=0?b.charAt(j)-'0':0;
            jin = sum/2;
            sb.append(sum%2);
        }
        sb.append(jin==0?"":1);
        return sb.reverse().toString();
    }
}
