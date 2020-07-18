package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author SijiaweiBarry
 * @create 2020/3/5 22:10
 */
public class T17电话号码的字母组合 {
    public List<String> letterCombinations(String digits) {
        Map<Integer,char[]> map = new HashMap<>();
        List<String>res = new ArrayList<>();
        if (digits.length()==0)return res;
        map.put(2,new char[]{'a','b','c'});
        map.put(3,new char[]{'d','e','f'});
        map.put(4,new char[]{'g','h','i'});
        map.put(5,new char[]{'j','k','l'});
        map.put(6,new char[]{'m','n','o'});
        map.put(7,new char[]{'p','q','r','s'});
        map.put(8,new char[]{'t','u','v'});
        map.put(9,new char[]{'w','x','y','z'});
        backTrace(map,res,digits,new char[digits.length()],0);
        return res;
    }

    private void backTrace(Map<Integer,char[]> map, List<String> res, String digits, char[] chars, int i) {
        if (i == digits.length()){
            res.add(new String(chars));
            return;
        }
        char[]temp = map.get(digits.charAt(i)-'0');
        for (int j = 0; j <temp.length ; j++) {
            chars[i] = temp[j];
            backTrace(map,res,digits,chars,i+1);
        }
    }
}
