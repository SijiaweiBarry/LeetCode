package Leetcode;

import java.util.Stack;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/10 19:13
 */
public class T85最大矩形 {
    public int maximalRectangle(char[][] matrix) {
        if (matrix==null||matrix.length==0||matrix[0].length==0){
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int height[] = new int[n+2];
        int res = 0;
        for (int i = 0; i <m ; i++) {
            Stack<Integer>stack = new Stack<>();
            for (int j = 0; j <height.length ; j++) {
                if (j>=1&&j<=n){
                    if (matrix[i][j-1]=='1'){height[j]+=1;}else {height[j]=0;}
                }
                while (!stack.isEmpty()&&height[stack.peek()]>height[j])
                {
                    int cur = stack.pop();
                    res = Math.max(res,(j-stack.peek()-1)*height[cur]);
                }
                stack.push(j);
            }
        }
        return res;
    }
}
