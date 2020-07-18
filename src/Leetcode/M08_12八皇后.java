package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/9/16 16:48
 */
public class M08_12八皇后 {
    List<List<String>>res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        HashSet<Integer>zhuD = new HashSet<>();
        HashSet<Integer>fuD = new HashSet<>();
        HashSet<Integer>cul = new HashSet<>();
        helpBackTracking(n,new ArrayList<String>(),zhuD,fuD,0,cul);
        return res;

    }

    private void helpBackTracking(int n, ArrayList<String> strings, HashSet<Integer> zhuD, HashSet<Integer> fuD, int row,HashSet<Integer> cul) {
        if (row==n){
            res.add(new ArrayList<>(strings));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!zhuD.contains(i+row)&&!fuD.contains(i-row)&&!cul.contains(i)){
                char[]temp = new char[n];
                Arrays.fill(temp,'.');
                temp[i] = 'Q';
                strings.add(new String(temp));
                zhuD.add(i+row);
                fuD.add(i-row);
                cul.add(i);
                helpBackTracking(n,strings,zhuD,fuD,row+1,cul);
                strings.remove(strings.size()-1);
                cul.remove(i);
                fuD.remove(i-row);
                zhuD.remove(i+row);
            }
        }
    }
}
