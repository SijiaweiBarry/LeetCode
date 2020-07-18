package Leetcode.strings;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/17 13:09
 */

import java.util.ArrayList;
import java.util.List;

/**125. 验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 *
 * 输入: "race a car"
 * 输出: false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-palindrome
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T125_valid_palindrome {
    public boolean isPalindrome(String s) {
        List<Character>list = new ArrayList<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (!Character.isLetterOrDigit(aChar)){
                continue;
            }
            else if (Character.isLetter(aChar)){
                list.add(Character.toLowerCase(aChar));
            }else {
                list.add(aChar);
            }

        }
        int left = 0;
        int right = list.size()-1;
        while (left<right){
            if (!list.get(left).equals(list.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
