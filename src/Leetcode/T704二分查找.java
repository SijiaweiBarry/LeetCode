package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/29 19:50
 */
public class T704二分查找 {
    public int search(int[] nums, int target) {
        if (nums==null){
            return -1;
        }
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = left+(right-left)/2;
            if (nums[mid]==target){
                return mid;
            }
            if (nums[mid]>target){
                right = mid -1;
            }else {
                left = mid+1;
            }
        }
        return -1;
    }
}
