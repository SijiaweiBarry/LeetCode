package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/20 21:41
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 829. 连续整数求和
 * 给定一个正整数 N，试求有多少组连续正整数满足所有数字之和为 N?
 * 示例 1:
 * 输入: 5
 * 输出: 2
 * 解释: 5 = 5 = 2 + 3，共有两组连续整数([5],[2,3])求和后为 5。
 *
 * 示例 2:
 * 输入: 9
 * 输出: 3
 * 解释: 9 = 9 = 4 + 5 = 2 + 3 + 4
 *
 * 示例 3:
 * 输入: 15
 * 输出: 4
 * 解释: 15 = 15 = 8 + 7 = 4 + 5 + 6 = 1 + 2 + 3 + 4 + 5
 * https://leetcode-cn.com/problems/consecutive-numbers-sum/
 *
 *
 * Solution:
 *
 * 假设 N=由 区间 [a,a+k-1][a,a+k−1] 累加得到 等差数列 首项为 aa ，项数 为 kk
 *
 * 其中 a>=1a>=1，k>=1k>=1 且都为整数
 *
 * N=(a+a+k-1)*k/2N=(a+a+k−1)∗k/2
 *
 * -> a*k=N-(k-1)*k/2a∗k=N−(k−1)∗k/2
 *
 * -> (k-1)*k/2<N(k−1)∗k/2<N && (N-(k-1)*k/2 )(N−(k−1)∗k/2) 能被 kk 整除
 *
 * 作者：beijixiong
 * 链接：https://leetcode-cn.com/problems/consecutive-numbers-sum/solution/you-deng-chai-shu-lie-jin-xing-shu-xue-tui-dao-by-/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class T829_consecutive_numbers_sum {
    public int consecutiveNumbersSum(int N) {
        int count=0;
        for(int i=1;(i-1)*i/2<N;i++){
            int tmp=N-(i-1)*i/2;
            if(tmp%i==0){
                count++;
            }
        }

        return count;
    }
}
