package sort;

/**
 * @Author SijiaweiBarry
 * @create 2020/3/18 17:53
 */
public class bubbleSort {
    public static void bubbleSort(int[]arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            int isChanged = 0;
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isChanged = 1;
                }
            }
            if (isChanged==0){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int []test = {2,1,3,5,8,7,9};
        bubbleSort(test);
        for (int i : test) {
            System.out.print(i+" ");
        }
    }
}
