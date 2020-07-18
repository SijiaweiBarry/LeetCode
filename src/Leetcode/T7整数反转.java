package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/29 20:29
 */
public class T7整数反转 {
    public int reverse(int x) {
        int res = 0;
        while (x!=0){
            int p = x % 10;
            if (res > Integer.MAX_VALUE/10 || res==Integer.MAX_VALUE/10&&p>=7)return 0;
            if (res < Integer.MIN_VALUE/10 || res==Integer.MIN_VALUE/10&&p<=-8)return 0;
            res = res * 10 + p;
            x/=10;
        }
        return res;
    }
}
