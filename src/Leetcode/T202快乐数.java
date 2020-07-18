package Leetcode;

import java.util.HashSet;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/18 20:20
 */
public class T202快乐数 {
    public boolean isHappy(int n) {
        HashSet<Integer>hashSet = new HashSet<>();
        while (n!=1){
            n=change(n);
            if (hashSet.contains(n)){
                return false;
            }
            hashSet.add(n);
        }
        return true;
    }

    private int change(int n) {
        int sum=0;
        while (n>0){
            int temp =n%10;
            n/=10;
            sum+=temp*temp;
        }
        return sum;
    }
}
