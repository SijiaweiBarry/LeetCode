package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T198打家劫舍 {

    public static int findUnsortedSubarray(int[] nums) {
        List<Integer>list=new ArrayList<>();
        for (int i = 0; i <nums.length ; i++) {
            list.add(nums[i]);
        }
        Collections.sort(list);

        int start=0;
        int end=0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]!=list.get(i)) {
                start = i;
                break;
            }
            if (i==nums.length-1){
                return 0;
            }

        }
        for (int i = nums.length-1; i >=0 ; i--) {
            if (nums[i]!=list.get(i)) {
                end = i;
                break;
            }
        }

        return end-start+1;

    }

    public static void main(String[] args) {
        int nums[]={2, 6, 4, 8, 10, 9, 15};
        System.out.println(findUnsortedSubarray(nums));
    }
}
