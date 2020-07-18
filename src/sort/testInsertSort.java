package sort;

/**
 * @Author SijiaweiBarry
 * @create 2020/6/1 23:01
 */
public class testInsertSort {
    public static void insertSort(int arr[]){
        if (arr==null||arr.length<=1){
            return;
        }
        for (int i = 1; i <arr.length ; i++) {
            int temp = arr[i];
            int j = i-1;
            while (j>=0&&arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[] args) {
        int []test = {2,1,3,5,8,7,9};
        insertSort(test);
        for (int i : test) {
            System.out.print(i+" ");
        }
    }
}
