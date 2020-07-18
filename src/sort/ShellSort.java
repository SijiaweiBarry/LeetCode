package sort;

/**
 * @Author SijiaweiBarry
 * @create 2020/3/18 21:03
 */
public class ShellSort {
    public static void shellSort(int arr[]){
       if (arr.length==0)return ;
       int length = arr.length;
       int gap = length/2;
       int cur;
       while (gap>0){
           for (int i = gap; i <arr.length ; i++) {
               int pre = i-gap;
               cur = arr[i];
               while (pre>=0&&cur<=arr[pre]){
                   arr[pre+gap] = arr[pre];
                   pre-=gap;
               }
               arr[pre+gap] = cur;
           }
           gap/=2;
       }

    }
    public static void main(String[] args) {
        int arr[] = new int[]{3,2,5,6,4,2,8,9,7};
        shellSort(arr);
        for (int anInt : arr) {
            System.out.print(anInt+" ");
        }
    }
}
