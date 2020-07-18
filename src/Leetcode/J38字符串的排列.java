package Leetcode;

import java.util.*;

/**
 * @Author SijiaweiBarry
 * @create 2020/5/12 16:43
 */
public class J38字符串的排列 {
    public String[] permutation(String s) {
        int len  =s.length();
        if (len==0)return new String[0];
        List<String>res = new ArrayList<>();
        boolean[]marked = new boolean[len];
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        StringBuilder sb = new StringBuilder("");
        dfs(ch,sb,marked,res,0,len);
        return res.toArray(new String[0]);
    }

    private void dfs(char[] ch,StringBuilder sb, boolean[] marked, List<String> res,int depth,int len) {
        if (depth==len){
            res.add(sb.toString());
            return;
        }
        for (int i = 0; i <len ; i++) {
            if (!marked[i]){
                if (i>0&&ch[i]==ch[i-1]&&!marked[i-1]){
                    continue;
                }
                marked[i] = true;
                sb.append(ch[i]);
                dfs(ch,sb,marked,res,depth+1,len);
                sb.deleteCharAt(sb.length()-1);
                marked[i] = false;
            }
        }
    }
}
