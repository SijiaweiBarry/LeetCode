package Leetcode;

import java.util.*;

/**
 * @Author SijiaweiBarry
 * @create 2020/9/24 16:39
 */
public class T51_N皇后 {
    List<List<String>>ans = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        HashSet<Integer>cul = new HashSet<>();
        HashSet<Integer>zhuD = new HashSet<>();
        HashSet<Integer>fuD = new HashSet<>();
        help(n,cul,zhuD,fuD,0,new ArrayList<String>());
        return ans;
    }

    private void help(int n, HashSet<Integer> cul, HashSet<Integer> zhuD, HashSet<Integer> fuD, int row, ArrayList<String> path) {
        if (row==n){
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!cul.contains(i)&&!zhuD.contains(i+row)&&!fuD.contains(i-row)){
                char[]temp = new char[n];
                Arrays.fill(temp,'.');
                temp[i] = 'Q';
                path.add(new String(temp));
                cul.add(i);
                zhuD.add(i+row);
                fuD.add(i-row);
                help(n,cul,zhuD,fuD,row+1,path);
                fuD.remove(i-row);
                zhuD.remove(i+row);
                cul.remove(i);
                path.remove(path.size()-1);
            }
        }
    }
}
