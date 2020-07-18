package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/25 11:18
 */
public class T172_阶乘后的零 {
    public int trailingZeroes(int n) {
        int ans = 0;
        while (n>0){
            ans+=n/5;
            n = n/5;
        }
        return ans;
    }
}
