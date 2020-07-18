package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/5/22 21:51
 */
public class T8字符串转换整数 {
    public int myAtoi(String str) {
        if(str.length()==0||str==null)return 0;
        char[] chars = str.toCharArray();
        int flag = 1;
        int i=0;
        int res = 0;
        while (i<str.length()&&chars[i]==' ')i++;
        if (i<str.length()&&chars[i]=='-')flag=-1;
        if (i<str.length()&&(chars[i]=='-'||chars[i]=='+'))i++;
        while (i<str.length()&&Character.isDigit(chars[i])){
            int temp = chars[i]-'0';
            if (res>Integer.MAX_VALUE/10||(res==Integer.MAX_VALUE/10&&temp>7)){
                return flag>0?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            res=res*10+temp;
            i++;
        }
        return flag>0?res:-res;
    }
}
