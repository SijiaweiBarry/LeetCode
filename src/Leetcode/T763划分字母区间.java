package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/2 11:17
 */
public class T763划分字母区间 {
    public List<Integer> partitionLabels(String S) {
        int[]last = new int[26];
        for (int i = 0; i <S.length() ; i++) {
            last[S.charAt(i)-'a'] = i ;
        }
        List<Integer>res = new ArrayList<>();
        int start = 0;
        int j=0;
        for (int i = 0; i <S.length() ; i++) {
            j = Math.max(j,last[S.charAt(i)-'a']);
            if (i==j){
                res.add(i-start+1);
                start = i + 1;
            }
        }
        return res;
    }
}
