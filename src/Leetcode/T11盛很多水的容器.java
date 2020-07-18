package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/19 15:00
 */
public class T11盛很多水的容器 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while (left<right){
            if (height[left]<height[right]){
                maxArea = Math.max(maxArea,(right-left)*height[left]);
                left++;
            }else {
                maxArea = Math.max(maxArea,(right-left)*height[right]);
                right--;
            }

        }
        return maxArea;
    }
}
