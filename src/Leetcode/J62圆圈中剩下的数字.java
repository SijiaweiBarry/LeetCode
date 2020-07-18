package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/5/1 22:15
 */
public class J62圆圈中剩下的数字 {
    public static int lastRemaining(int n,int m){
        return n==1?0:(lastRemaining(n-1,m)+m)%n;
    }
}
