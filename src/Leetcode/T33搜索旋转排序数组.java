package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/18 21:12
 */
public class T33搜索旋转排序数组 {
    public int search(int[] nums, int target) {
        if (nums.length==0||nums==null){
            return -1;
        }
        int start=0;
        int end = nums.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            if (nums[mid]==target){
                return mid;
            }
            if (nums[mid]>=nums[start]){
                if (nums[start]<=target&&nums[mid]>target){
                    end = mid - 1;
                }else {
                    start = mid+1;
                }
            }else {
                if (target<=nums[end]&&target>nums[mid]){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
