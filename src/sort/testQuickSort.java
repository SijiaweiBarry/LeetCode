package sort;



/**
 * @Author SijiaweiBarry
 * @create 2020/6/1 22:39
 */
public class testQuickSort {
    public static void quickSort(int[]arr,int left,int right){
        if (arr==null||arr.length<=1||left>=right){
            return;
        }
        int partition = help(arr,left,arr.length-1);
        quickSort(arr,left,partition-1);
        quickSort(arr,partition+1,right);
    }

    private static int help(int[] arr, int left, int right) {
        int first = arr[left];
        while (left<right){
            while (left<right&&arr[right]>=first){
                right--;
            }
            swap(arr,left,right);
            while (left<right&&arr[left]<=first){
                left++;
            }
            swap(arr,left,right);
        }
        return left;
    }
    public static void swap(int arr[],int i,int j){
        if (i!=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public static void main(String[] args) {
        int []test = {2,1,3,5,8,7,9};
        quickSort(test,0,test.length-1);
        for (int i : test) {
            System.out.print(i+" ");
        }
    }
}
