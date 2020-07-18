package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/29 20:12
 */
public class T349两个数组的交集 {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer>list = new ArrayList<>();
        List<Integer>res= new ArrayList<>();
        for (int i = 0; i <nums1.length ; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i <nums2.length ; i++) {
            if (list.contains(nums2[i])&&!res.contains(nums2[i])){
                res.add(nums2[i]);
            }
        }
        int[]r = new int[res.size()];
        for (int i = 0; i <r.length ; i++) {
            r[i] = res.get(i);
        }
        return r;
    }
}
