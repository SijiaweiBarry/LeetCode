package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/25 11:55
 *
 * 233. 数字 1 的个数
 * 给定一个整数 n，计算所有小于等于 n 的非负整数中数字 1 出现的个数。
 *
 * 示例:
 *
 * 输入: 13
 * 输出: 6
 * 解释: 数字 1 出现在以下数字中: 1, 10, 11, 12, 13 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/number-of-digit-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T233_数字1的个数 {
    public int countDigitOne(int n) {
        int count = 0;
        for (long k = 1; k <= n; k *= 10) {
            // xyz d abc
            long abc = n % k;
            long xyzd = n / k;
            long d = xyzd % 10;
            long xyz = (xyzd + 8) / 10;
            count += xyz * k;
            if (d == 1) {
                count += abc + 1;
            }
        }
        return count;
    }
}
