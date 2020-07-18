package Leetcode.backtracking;

/**
 * @Author SijiaweiBarry
 * @create 2020/6/22 22:28
 */

import java.util.HashSet;
import java.util.Set;

/**
 * 357. 计算各个位数不同的数字个数
 * 给定一个非负整数 n，计算各位数字都不同的数字 x 的个数，其中 0 ≤ x < 10^n 。
 *
 * 示例:
 *
 * 输入: 2
 * 输出: 91
 * 解释: 答案应为除去 11,22,33,44,55,66,77,88,99 外，在 [0,100) 区间内的所有数字。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/count-numbers-with-unique-digits/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T357_count_numbers_with_unique_digits {
    int ans = 0;
    public int countNumbersWithUniqueDigits(int n) {
        if (n>10){
            return countNumbersWithUniqueDigits(10);
        }
        if (n==0){
            return 1;
        }
        //首位不能为零
        for (int i = 1; i <=9 ; i++) {
            Set<Integer>set = new HashSet<>();
            set.add(i);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(i+"");
            backtracking(set,n,stringBuilder);
        }

        return ans+1;
    }

    private void backtracking(Set<Integer> set, int n, StringBuilder stringBuilder) {
        if (stringBuilder.length()==n){
            ans++;
            return;
        }else {
            ans++;
        }
        for (int i = 0; i <10 ; i++) {
            if (set.contains(i)){
                continue;
            }
            set.add(i);
            stringBuilder.append(i+"");
            backtracking(set,n,stringBuilder);
            set.remove(i);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }
}
