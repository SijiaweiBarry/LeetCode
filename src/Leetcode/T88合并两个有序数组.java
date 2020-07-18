package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/18 10:45
 */
public class T88合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int []num = new int[m+n];
        int a=0;
        int i=0;
        int j=0;
        while (i<m&&j<n){
            if (nums1[i]<nums2[j]){
                num[a] = nums1[i];
                a++;
                i++;
            }else{
                num[a] = nums2[j];
                a++;
                j++;
            }
        }
        while (i<m){
            num[a] = nums1[i];
            i++;
            a++;
        }
        while (j<n){
            num[a] = nums2[j];
            j++;
            a++;
        }
        for (int k = 0; k <num.length ; k++) {
            nums1[k] = num[k];
        }
    }
}
