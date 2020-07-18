package Leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/31 21:35
 */
public class T3无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        if (s==null) return 0;
        Set<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int ans = 0;
        while (j < s.length()){
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans ,j-i);
            }else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
