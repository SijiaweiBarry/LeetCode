package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/15 22:40
 */

import java.util.HashMap;
import java.util.List;

/**399. 除法求值
 * 给出方程式 A / B = k, 其中 A 和 B 均为用字符串表示的变量， k 是一个浮点型数字。根据已知方程式求解问题，并返回计算结果。如果结果不存在，则返回 -1.0。
 *
 * 示例 :
 * 给定 a / b = 2.0, b / c = 3.0
 * 问题: a / c = ?, b / a = ?, a / e = ?, a / a = ?, x / x = ? 
 * 返回 [6.0, 0.5, -1.0, 1.0, -1.0 ]
 *
 * 输入为: vector<pair<string, string>> equations, vector<double>& values, vector<pair<string, string>> queries(方程式，方程式结果，问题方程式)， 其中 equations.size() == values.size()，即方程式的长度与方程式结果长度相等（程式与结果一一对应），并且结果值均为正数。以上为方程式的描述。 返回vector<double>类型。
 *
 * 基于上述例子，输入如下：
 *
 * equations(方程式) = [ ["a", "b"], ["b", "c"] ],
 * values(方程式结果) = [2.0, 3.0],
 * queries(问题方程式) = [ ["a", "c"], ["b", "a"], ["a", "e"], ["a", "a"], ["x", "x"] ].
 * 输入总是有效的。你可以假设除法运算中不会出现除数为0的情况，且不存在任何矛盾的结果。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/evaluate-division
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T399_除法求值 {
    public double[] calcEquation(List<List<String>> equations,
                                 double[] values,
                                 List<List<String>> queries) {
        int count = 0;
        HashMap<String,Integer>unKnownNum = new HashMap<>();
        for (List<String> equation : equations) {
            for (String s : equation) {
                if (unKnownNum.containsKey(s)){continue;}
                unKnownNum.put(s,count++);
            }
        }
        double[][]grip = new double[count+1][count+1];
        for (String s : unKnownNum.keySet()) {
            int x = unKnownNum.get(s);
            grip[x][x] = 1.0;
        }
        for (int i = 0; i < values.length; i++) {
            int x = unKnownNum.get(equations.get(i).get(0));
            int y = unKnownNum.get(equations.get(i).get(1));
            grip[x][y] = values[i];
            grip[y][x] = 1/values[i];
        }
        for (int i = 0; i < count + 1; i++) {
            for (int j = 0; j < count + 1; j++) {
                for (int k = 0; k < count + 1; k++) {
                    if (j==k||grip[j][k]!=0){continue;}
                    if (grip[j][i]!=0&&grip[i][k]!=0){
                        grip[j][k] = grip[j][i] * grip[i][k];
                    }
                }
            }
        }
        double[] ans = new double[queries.size()];
        for (int i = 0; i <queries.size() ; i++) {
            List<String> list = queries.get(i);
            String x = list.get(0);
            String y = list.get(1);
            if (!unKnownNum.containsKey(x)||!unKnownNum.containsKey(y)){
                ans[i] = -1.0;
                continue;
            }
            Integer xx = unKnownNum.get(x);
            Integer yy = unKnownNum.get(y);
            ans[i] = grip[xx][yy]==0?-1.0:grip[xx][yy];
        }
        return ans;
    }
}
