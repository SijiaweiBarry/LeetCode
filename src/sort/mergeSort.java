package sort;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/5 21:03
 */
public class mergeSort {
    //归并所需要的辅助数组
    private static Comparable[] assist;

    /**
     * 比较v元素是否小于w元素
     */
    private static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }


    /**
     * 对数组a中的元素进行排序
     */
    private static void sort(Comparable []a){
        //1.初始化辅助数组
        assist = new Comparable[a.length];
        sort(a,0,a.length-1);
    }

    /**
     * 对数组a中从low到high的元素进行排序
     */
    private static void sort(Comparable []a,int low,int high){
        //安全性校验
        if (high<=low){
            return;
        }

        //对low到high之间的数据进行分组
        int mid = low+(high-low)/2;

        //分别对每一组数据进行排序
        sort(a,low,mid);
        sort(a,mid+1,high);

        //两组数据进行归并
        merge(a,low,mid,high);
    }

    /**
     * 对数组中，从low到mid为一组，从mid+1到high为一组，对这两组数据进行归并
     */
    private static void merge(Comparable[]a,int low,int mid,int high){
        //定义三个指针
        int i = low;
        int p1 = low;
        int p2 = mid+1;

        //遍历，移动p1指针和p2指针，比较对应索引处的值，找出小的那个，放到辅助数组的对应索引处
        while (p1<=mid&&p2<=high){
            if (less(a[p2],a[p1])){
                assist[i++] = a[p2++];
            }else {
                assist[i++] = a[p1++];
            }
        }
        //若p1的指针没有走完，那么顺序移动p1指针，把对应的元素放到辅助数组的对应索引处
        while (p1<=mid){
            assist[i++] = a[p1++];
        }
        //若p2的指针没有走完，那么顺序移动p2指针，把对应的元素放到辅助数组的对应索引处
        while (p2<=high){
            assist[i++] = a[p2++];
        }
        //把辅助数组中的元素拷贝到原数组中
        for (int index = low; index <=high ; index++) {
            a[index] = assist[index];
        }
    }
}
