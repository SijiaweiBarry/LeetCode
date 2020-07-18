package sort;

/**
 * @Author SijiaweiBarry
 * @create 2020/6/2 9:15
 */
public class testHeapSort {
    public static void heapAdjust(int []arr,int parent,int length){
        int temp = arr[parent];
        int child = parent*2+1;
        while (child<length){
            if (child+1<length&&arr[child+1]>arr[child]){
                child++;
            }
            if (temp >=arr[child]){
                break;
            }
            arr[parent] = arr[child];
            parent = child;
            child = child*2+1;
        }
        arr[parent] = temp;
    }
    public static void heapSort(int[]arr){
        for (int i = arr.length/2; i >=0 ; i--) {
            heapAdjust(arr,i,arr.length);
        }
        for (int i = arr.length-1; i >0 ; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapAdjust(arr,0,i);
        }
    }
    public static void main(String[] args) {
        int []test = {2,1,3,5,8,7,9};
        heapSort(test);
        for (int i : test) {
            System.out.print(i+" ");
        }
    }
}
