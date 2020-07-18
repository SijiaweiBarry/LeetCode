package sort;

/**
 * @Author SijiaweiBarry
 * @create 2020/6/1 23:22
 */
public class testShellSort {
    public static void shellSort(int arr[]){
        if (arr==null||arr.length<=1){
            return;
        }
        int gap = arr.length/2;
        while (gap>0){
            for (int i = gap; i <arr.length ; i++) {
                int temp = arr[i];
                int j = i-gap;
                while (j>=0&&arr[j]>temp){
                    arr[j+gap] = arr[j];
                    j-=gap;
                }
                arr[j+gap] = temp;
            }
            gap/=2;
        }
    }
    public static void main(String[] args) {
        int []test = {2,1,3,5,8,7,9};
        shellSort(test);
        for (int i : test) {
            System.out.print(i+" ");
        }
    }
}
