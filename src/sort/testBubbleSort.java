package sort;

/**
 * @Author SijiaweiBarry
 * @create 2020/6/1 22:54
 */
public class testBubbleSort {
    public static void bubbleSort(int arr[]){
        if (arr==null&&arr.length<=1){return;}
        for (int i = 0; i <arr.length-1 ; i++) {
            boolean flag = true;
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if (flag){
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
