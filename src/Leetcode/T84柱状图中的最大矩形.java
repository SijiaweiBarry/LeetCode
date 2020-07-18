package Leetcode;

import java.util.Deque;
import java.util.Stack;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/10 17:57
 */
public class T84柱状图中的最大矩形 {
    public int largestRectangleArea(int[] heights) {
        if (heights==null||heights.length==0){return 0;}
        int height[] = new int[heights.length+2];
        for (int i = 1; i <height.length-1 ; i++) {
            height[i] = heights[i-1];
        }
        int res = 0;
        Stack<Integer>stack = new Stack<>();
        for (int i = 0; i <height.length ; i++) {
            while (!stack.isEmpty()&&height[stack.peek()]>height[i]){
                int cur = stack.pop();
                res = Math.max(res,(i-stack.peek()-1)*height[cur]);
            }
            stack.push(i);
        }
        return res;
    }
}
