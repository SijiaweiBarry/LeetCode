package Leetcode;

import java.util.*;

/**
 * @Author SijiaweiBarry
 * @create 2021/9/1 23:41
 */
public class newTest {
    public int[] plusOne(int[] digits) {
        List<Integer> ints = new ArrayList<>();
        for (int digit : digits) {
            ints.add(digit);
        }
        List<Integer> res = new ArrayList<>();
        Boolean flag = false;
        for (int i = ints.size()-1; i >=0; i--) {
            int temp = ints.get(i);
            if (i==ints.size()-1){
                temp++;
            }
            if (flag){
                temp++;
                flag = false;
            }
            if (temp/10!=0){
                flag = true;
            }
            res.add(temp%10);
        }
        if (flag){
            res.add(1);
        }
        Collections.reverse(res);
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}
