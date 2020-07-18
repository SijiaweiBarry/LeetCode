package sort;

/**
 * @Author SijiaweiBarry
 * @create 2020/3/18 18:12
 */
public class SelectionSort {
    public static int []selectionSort(int[]arr){
        if (arr.length==0)return arr;
        for (int i = 0; i <arr.length ; i++) {
            int minPos = i;
            for (int j = i; j <arr.length ; j++) {
                if (arr[minPos]>=arr[j]){
                    minPos = j;
                }
            }
            if (i!=minPos){
                int temp = arr[i];
                arr[i] = arr[minPos];
                arr[minPos] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{3,2,5,6,4,2,8,9,7};
        int[] ints = selectionSort(arr);
        for (int anInt : ints) {
            System.out.print(anInt+" ");
        }
    }
}
