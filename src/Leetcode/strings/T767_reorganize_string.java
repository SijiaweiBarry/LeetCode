package Leetcode.strings;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/17 12:10
 */

import java.util.Arrays;

/**767. 重构字符串
 * 给定一个字符串S，检查是否能重新排布其中的字母，使得两相邻的字符不同。
 *
 * 若可行，输出任意可行的结果。若不可行，返回空字符串。
 *
 * 示例 1:
 *
 * 输入: S = "aab"
 * 输出: "aba"
 * 示例 2:
 *
 * 输入: S = "aaab"
 * 输出: ""
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reorganize-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T767_reorganize_string {
    public String reorganizeString(String S) {
        int []characterTime = new int[26];
        char[] chars = S.toCharArray();
        for (char aChar : chars) {
            characterTime[aChar-'a']+=100;
        }
        for (int i = 0; i < characterTime.length; i++) {
            characterTime[i] += i;
        }
        Arrays.sort(characterTime);
        char []ans = new char[chars.length];
        int index = 1;
        for (int i : characterTime) {
            int times = i/100;
            if (times>(1+chars.length)/2){return "";}
            char c = (char) (i%100+'a');

            for (int j = 0;j<times;j++) {
                if (index>=ans.length){
                    index = 0;
                }
                ans[index] = c;
                index += 2;
            }
        }
        return new String(ans);
    }
}
