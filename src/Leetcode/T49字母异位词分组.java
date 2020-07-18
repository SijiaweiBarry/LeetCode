package Leetcode;

import java.util.*;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/19 16:06
 */
public class T49字母异位词分组 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List> res = new HashMap<String,List>();
        for (String str:strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!res.containsKey(key)){
                res.put(key,new ArrayList());
            }
            res.get(key).add(str);
        }
        return null ;// TODO
    }
}
