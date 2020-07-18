package sort;

/**
 * @Author SijiaweiBarry
 * @create 2020/6/1 23:07
 */
public class testSelectionSort {
    public static void selectionSort(int arr[]){
        if (arr==null||arr.length<=1){
            return;
        }
        for (int i = 0; i <arr.length-1 ; i++) {
            int temp = i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j]<=arr[temp]){
                    temp = j;
                }
            }
            if (i!=temp){
                int t = arr[i];
                arr[i] = arr[temp];
                arr[temp] = t;
            }
        }
    }
    public static void main(String[] args) {
        int []test = {2,1,3,5,8,7,9};
        selectionSort(test);
        for (int i : test) {
            System.out.print(i+" ");
        }
    }
}
