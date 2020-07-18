package Leetcode.backtracking;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/6 0:38
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 306.累加数
 * 累加数是一个字符串，组成它的数字可以形成累加序列。
 *
 * 一个有效的累加序列必须至少包含 3 个数。除了最开始的两个数以外，字符串中的其他数都等于它之前两个数相加的和。
 *
 * 给定一个只包含数字 '0'-'9' 的字符串，编写一个算法来判断给定输入是否是累加数。
 *
 * 说明: 累加序列里的数不会以 0 开头，所以不会出现 1, 2, 03 或者 1, 02, 3 的情况。
 *
 * 示例 1:
 *
 * 输入: "112358"
 * 输出: true
 * 解释: 累加序列为: 1, 1, 2, 3, 5, 8 。1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8
 * 示例 2:
 *
 * 输入: "199100199"
 * 输出: true
 * 解释: 累加序列为: 1, 99, 100, 199。1 + 99 = 100, 99 + 100 = 199
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/additive-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T306_additive_number {
    public static boolean isAdditiveNumber(String num) {
        List<Integer>list = new ArrayList<>();
        return backTrack(num,0,list);
    }

    private static boolean backTrack(String num, int pos, List<Integer> list) {
        if (pos==num.length()){
            if (list.size()>2){
            return true;
            }
                return false;

        }
        int curNum = 0;
        for (int i = pos; i <num.length() ; i++) {
            curNum = curNum * 10 + (num.charAt(i)-'0');
            if (list.size()<2||list.get(list.size()-1)+list.get(list.size()-2)==curNum){
                list.add(curNum);
                if (backTrack(num,i+1,list)){
                    return true;
                }
                list.remove(list.size()-1);
            }
            if (pos==i&&num.charAt(i)=='0'){
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAdditiveNumber("1023"));
    }
}
