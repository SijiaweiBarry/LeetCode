package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/24 19:03
 */
public class T34在排序数组中查找元素的第一个和最后一个位置 {
    public int[] searchRange(int[] nums, int target) {
        int start = -1;
        int end = -1;
        for (int i = 0; i <nums.length; i++) {
            if (nums[i] == target){
                start = i;
                break;
            }
        }
        if (start == -1){
            return new int[]{-1,-1};
        }
        if (nums.length==1&&start==0){
            return new int[]{0,0};
        }
        for (int i = start; i <nums.length ; i++) {
            if (nums[i]!=target){
                end = i-1;
                break;
            }
            if (i==nums.length-1){
                end = nums.length-1;
            }
        }
        return new int[]{start,end};
    }
}
