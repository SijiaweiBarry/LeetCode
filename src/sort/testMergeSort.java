package sort;

/**
 * @Author SijiaweiBarry
 * @create 2020/6/1 22:22
 */
public class testMergeSort {
    public static void mergeSort(int[]arr){
        if (arr==null||arr.length<=1){
            return;
        }
        int []newArray = new int[arr.length];
        mergeSort(arr,0,arr.length-1,newArray);
    }

    private static void mergeSort(int[] arr, int left, int right, int[] newArray) {
        if (left>=right){
            return;
        }
        int mid = left + (right-left)/2;
        mergeSort(arr,left,mid,newArray);
        mergeSort(arr,mid+1,right,newArray);
        for (int i = left; i <=right ; i++) {
            newArray[i] = arr[i];
        }
        int i = left;
        int j = mid+1;
        int k = left;
        while (i<=mid&&j<=right){
            if (newArray[i]<=newArray[j]){
                arr[k++] = newArray[i++];
            }else {
                arr[k++] = newArray[j++];
            }
        }
        while (i<=mid){
            arr[k++] = newArray[i++];
        }
    }
    public static void main(String[] args) {
        int []test = {2,1,3,5,8,7,9};
        mergeSort(test);
        for (int i : test) {
            System.out.print(i+" ");
        }
    }

}
