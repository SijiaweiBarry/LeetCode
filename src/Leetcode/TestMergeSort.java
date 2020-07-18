package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/5 18:42
 */
public class TestMergeSort {
   public static int[]sort(int arr[],int l,int r){
       if (l==r){
           return new int[]{arr[l]};
       }
       int mid = l+(r-l)/2;
       int []leftArr = sort(arr,l,mid);
       int []rightArr = sort(arr,mid+1,r);
       int []newNum = new int[leftArr.length+rightArr.length];
       int m=0;int i=0;int j = 0;
       while (i<leftArr.length&&j<rightArr.length){
           newNum[m++] = leftArr[i]<=rightArr[j]?leftArr[i++]:rightArr[j++];
       }
       while (i<leftArr.length){
           newNum[m++] = leftArr[i++];
       }
       while (j<rightArr.length){
           newNum[m++] = rightArr[j++];
       }
       return newNum;
   }

    public static void main(String[] args) {
        int [] test= new int[]{3,2,1,5,6,7,0,9};
        int []res = sort(test,0,test.length-1);
        for (int re : res) {
            System.out.print(re+" ");
        }
    }
}
