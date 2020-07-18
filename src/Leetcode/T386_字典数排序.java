package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/9/24 17:36
 */
public class T386_字典数排序 {
    List<Integer>ans = new ArrayList<>();
    public List<Integer> lexicalOrder(int n) {
        help(n,0,0);
        return ans;
    }

    private void help(int n, int start, int temp) {
        if (temp>n){
            return;
        }
        if (temp>0) {
            ans.add(temp);
        }
        for (int i = start>0?0:1; i <=9 ; i++) {
            help(n,start+1,temp*10+i);
        }
    }
}
