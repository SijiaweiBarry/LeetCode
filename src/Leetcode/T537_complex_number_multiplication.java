package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/22 2:11
 */

/**
 * 537. 复数乘法
 * 给定两个表示复数的字符串。
 *
 * 返回表示它们乘积的字符串。注意，根据定义 i2 = -1 。
 *
 * 示例 1:
 *
 * 输入: "1+1i", "1+1i"
 * 输出: "0+2i"
 * 解释: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i ，你需要将它转换为 0+2i 的形式。
 * 示例 2:
 *
 * 输入: "1+-1i", "1+-1i"
 * 输出: "0+-2i"
 * 解释: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i ，你需要将它转换为 0+-2i 的形式。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/complex-number-multiplication
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T537_complex_number_multiplication {
    public static String complexNumberMultiply(String a, String b) {
        String[] splitA = a.split("[+i]");
        String[] splitB = b.split("[+i]");
        for (String s : splitA) {
            System.out.println(s);
        }
        int realNumA = Integer.parseInt(splitA[0]);
        int virNumA = Integer.parseInt(splitA[1]);
        int realNumB = Integer.parseInt(splitB[0]);
        int virNumB = Integer.parseInt(splitB[1]);
        return (realNumA*realNumB-virNumA*virNumB)+"+"+(realNumA*virNumB+virNumA*realNumB)+"i";
    }

    public static void main(String[] args) {
        String a = "1+1i";
        String b = "1+1i";
        complexNumberMultiply(a,b);
    }
}
