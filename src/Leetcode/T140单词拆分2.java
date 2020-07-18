package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/4 14:55
 */
public class T140单词拆分2 {
    public List<String> wordBreak(String s, List<String> wordDict) {
        HashSet<String>hashSet = new HashSet<>(wordDict);
        return wordBreakHelp(s,hashSet,new HashMap<String,List<String>>());
    }

    private List<String> wordBreakHelp(String s, HashSet<String> hashSet, HashMap<String, List<String>> map) {
        if (s.length()==0){
            return new ArrayList<>();
        }
        if (map.containsKey(s)){
            return map.get(s);
        }
        List<String>res = new ArrayList<>();
        for (int i = 0; i <s.length() ; i++) {
            if (hashSet.contains(s.substring(i,s.length()))){
                if (i==0){
                    res.add(s);
                }else {
                    List<String>temp = wordBreakHelp(s.substring(0,i),hashSet,map);
                    for (int j = 0; j <temp.size() ; j++) {
                        res.add(temp.get(j)+" "+s.substring(i,s.length()));
                    }
                }
            }
        }
        map.put(s,res);
        return res;
    }

}
