package sort;

/**
 * @Author SijiaweiBarry
 * @create 2020/3/18 20:24
 */
public class InsertSort {
    public static int []insertSort(int arr[]){
        for (int i = 0; i <arr.length-1 ; i++) {
            int cur = arr[i+1];
            int pre = i;
            while (pre>=0&&cur<arr[pre]){
                arr[pre+1] = arr[pre];
                pre--;
            }
            arr[pre+1] = cur;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{3,2,5,6,4,2,8,9,7};
        int[] ints = insertSort(arr);
        for (int anInt : ints) {
            System.out.print(anInt+" ");
        }
    }
}
