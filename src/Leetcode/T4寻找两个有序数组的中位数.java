package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/5 18:00
 */
public class T4寻找两个有序数组的中位数 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        return (findKth(nums1,0,length1-1,nums2,0,length2-1,(length1+length2+1)/2)+findKth(nums1,0,length1-1,nums2,0,length2-1,(length1+length2)/2+1))*0.5;
    }
    public int findKth(int nums1[],int start1,int end1,int nums2[],int start2,int end2,int k){
        int length1 = end1-start1+1;
        int length2 = end2-start2+1;
        if (length1>length2){
            return findKth(nums2,start2,end2,nums1,start1,end1,k);
        }
        if (length1==0){
            return nums2[start2+k-1];
        }
        if (length2==0){
            return nums1[start1+k-1];
        }
        if (k==1){
            return Math.min(nums1[start1],nums2[start2]);
        }
        int position1 = start1+Math.min(length1,k/2)-1;
        int position2 = start2+k/2-1;
        if (nums1[position1] > nums2[position2]){
            return findKth(nums1,start1,end1,nums2,position2+1,end2,k-k/2);
        }else {
            return findKth(nums1,position1+1,end1,nums2,start2,end2,k-Math.min(length1,k/2));
        }
    }


}
