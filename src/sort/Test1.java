package sort;

/**
 * @Author SijiaweiBarry
 * @create 2020/4/17 21:08
 */
public class Test1 {
    public static void shellSort(int arr[]) {
        int gap = arr.length/2;
        while (gap>0){
            for (int i = gap; i <arr.length ; i++) {
                int cur = arr[i];
                int pre = i-gap;
                while (pre>=0&&arr[pre]>=cur){
                    arr[pre+gap] = arr[pre];
                    pre-=gap;
                }
                arr[pre+gap] = cur;
            }
            gap/=2;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,6,5,7,9,8};
        shellSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
