package Leetcode.strings;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/16 16:29
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 3. 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T3_longest_substring_without_repeating_characters {
    public int lengthOfLongestSubstring(String s) {
        int ans =0;
        int left = 0;
        int right = 0;
        HashMap<Character,Integer> charactor = new HashMap<>();
        while (right<s.length()){
            char c = s.charAt(right);
            if (charactor.containsKey(c)){
                charactor.remove(s.charAt(left++));
            }else {
                charactor.put(c,right);
                ans = Math.max(ans,right-left);
                right++;
            }

        }
        return ans;
    }
}
