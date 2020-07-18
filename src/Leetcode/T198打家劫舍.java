package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T198打家劫舍 {
        public int rob(int[] nums) {
            if(nums.length==0)
                return 0;
            if(nums.length==1)
                return nums[0];
            int arr[]=new int[nums.length];
            arr[0]=nums[0];
            arr[1]=Math.max(nums[1],nums[0]);
            for (int i = 2; i <arr.length ; i++) {
                arr[i]=Math.max(arr[i-2]+nums[i],arr[i-1]);
            }
            return arr[arr.length-1];
        }
}
