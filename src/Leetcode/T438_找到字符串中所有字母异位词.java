package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/15 20:28
 */

/**
 * 438. 找到字符串中所有字母异位词
 * 给定一个字符串 s 和一个非空字符串 p，找到 s 中所有是 p 的字母异位词的子串，返回这些子串的起始索引。
 *
 * 字符串只包含小写英文字母，并且字符串 s 和 p 的长度都不超过 20100。
 *
 * 说明：
 *
 * 字母异位词指字母相同，但排列不同的字符串。
 * 不考虑答案输出的顺序。
 * 示例 1:
 *
 * 输入:
 * s: "cbaebabacd" p: "abc"
 *
 * 输出:
 * [0, 6]
 *
 * 解释:
 * 起始索引等于 0 的子串是 "cba", 它是 "abc" 的字母异位词。
 * 起始索引等于 6 的子串是 "bac", 它是 "abc" 的字母异位词。
 *  示例 2:
 *
 * 输入:
 * s: "abab" p: "ab"
 *
 * 输出:
 * [0, 1, 2]
 *
 * 解释:
 * 起始索引等于 0 的子串是 "ab", 它是 "ab" 的字母异位词。
 * 起始索引等于 1 的子串是 "ba", 它是 "ab" 的字母异位词。
 * 起始索引等于 2 的子串是 "ab", 它是 "ab" 的字母异位词。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-all-anagrams-in-a-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T438_找到字符串中所有字母异位词 {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer>need = new HashMap<>();
        HashMap<Character,Integer>window = new HashMap<>();
        char[] chars = p.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            need.put(chars[i],need.getOrDefault(chars[i],0)+1);
        }
        int value = 0;
        List<Integer>ans = new ArrayList<>();
        int left = 0;
        int right = 0;
        while (right<s.length()){
            char cur = s.charAt(right);
            right++;
            if (need.containsKey(cur)){
                window.put(cur,window.getOrDefault(cur,0)+1);
                if (window.get(cur).equals(need.get(cur))){
                    value++;
                }
            }
            while (right-left>=p.length()){
                char c = s.charAt(left);
                if (value==need.size()){
                    ans.add(left);
                }
                left++;
                if (need.containsKey(c)){
                    if (window.get(c).equals( need.get(c))){
                    value--;
                    }
                    window.put(c,window.get(c)-1);
                }
            }
        }
        return ans;
    }
}
