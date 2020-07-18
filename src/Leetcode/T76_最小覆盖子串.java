package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/8 23:29
 */

import java.util.HashMap;

/**76. 最小覆盖子串
 * 给你一个字符串 S、一个字符串 T 。请你设计一种算法，可以在 O(n) 的时间复杂度内，从字符串 S 里面找出：包含 T 所有字符的最小子串。
 * 示例：
 *
 * 输入：S = "ADOBECODEBANC", T = "ABC"
 * 输出："BANC"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-window-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T76_最小覆盖子串 {
    public String minWindow(String s, String t) {
        if (s.length()==0||t.length()==0){return "";}
        HashMap<Character,Integer>hashMap = new HashMap<>();
        int tCount = t.length();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
        }
        int left = 0;
        int right = 0;
        int ansLength = Integer.MAX_VALUE;
        String ans = "";
        while (right<s.length()){
            char c = s.charAt(right);
            hashMap.put(c,hashMap.getOrDefault(c,0)-1);
            if (hashMap.get(c)>=0){
                tCount--;
            }
            right++;
            while (tCount==0){
                if (ansLength>(right-left)){
                    ansLength = right-left;
                    ans = s.substring(left,right);
                }

                    char c1 = s.charAt(left);
                    hashMap.put(c1,hashMap.get(c1)+1);
                    if (hashMap.get(c1)>0) {
                        tCount++;
                    }
                left++;
            }

        }
            return ans;
    }
}
