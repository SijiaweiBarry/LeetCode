package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/14 9:36
 */
public class TestQuickSort {
    public static void quickSort(int []arr,int l,int r) {
       if (l>=r){
           return;
       }
       int par = partition(arr,l,r);
       quickSort(arr,l,par-1);
       quickSort(arr,par+1,r);
    }
    public static int partition(int []arr,int l,int r){
        int first = arr[l];
        while (l<r){
            while (l<r&&arr[r]>=first){
                r--;
            }
            swap(arr,l,r);
            while (l<r&&arr[l]<=first){
                l++;
            }
            swap(arr,l,r);
        }
        return l;
    }
    public static void swap(int []arr,int i,int j){
        if (i!=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,2,3,1,5,4,3};
        quickSort(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
