package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/5/22 20:39
 */
public class T93复原IP地址 {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        if (s==null||s.length()==0)return res;
        List<String> cur = new ArrayList<>();
        backTrace(s,res,cur,0);
        return res;
    }
    private void backTrace(String s, List<String> res, List<String> cur, int i) {
        if (cur.size()==4){
            if (i==s.length()){
                res.add(String.join(".",cur));
            }
            return;
        }
        for (int j = 1; j <=3 ; j++) {
            if (i+j>s.length()){
                break;
            }
            String segment = s.substring(i,i+j);
            if (segment.startsWith("0")&&segment.length()>1||Integer.parseInt(segment)>255){
                continue;
            }
            cur.add(segment);
            backTrace(s,res,cur,i+j);
            cur.remove(cur.size()-1);
        }
    }
}
