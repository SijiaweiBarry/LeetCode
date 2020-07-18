package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/9 12:32
 */
public class T42接雨水 {
    public int trap(int[] height) {
        int left_h[] = new int[height.length];
        int right_h[] = new int[height.length];
        for (int i = 1; i <height.length-1 ; i++) {
            left_h[i] = Math.max(height[i-1],left_h[i-1]);
        }
        for (int i = height.length-2; i >=1 ; i--) {
            right_h[i] = Math.max(right_h[i+1],height[i+1]);
        }
        int sum = 0;
        int temp;
        for (int i = 1; i <height.length-1 ; i++) {
            temp = Math.min(left_h[i],right_h[i]);
            if (height[i]<temp){
                sum+=(temp-height[i]);
            }
        }
        return sum;
    }
}
