package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/24 0:57
 */

import java.util.Arrays;

/**
 * 剑指 Offer 40. 最小的k个数
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 *
 * 示例 1：
 *
 * 输入：arr = [3,2,1], k = 2
 * 输出：[1,2] 或者 [2,1]
 * 示例 2：
 *
 * 输入：arr = [0,1,2,1], k = 1
 * 输出：[0]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class J40_最小的K个数 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr==null||arr.length==0){
            return new int[0];
        }
        return help(arr,0,arr.length-1,k-1);
    }

    private int[] help(int[] arr, int left, int right, int k) {
        int partition = partitionHelp(arr,left,right);
        if (partition==k){
            return Arrays.copyOf(arr,k+1);
        }
        if (partition<k){
            return help(arr,partition+1,right,k);
        }
        if (partition>k){
            return help(arr,left,partition-1,k);
        }
        return null;
    }

    private int partitionHelp(int[] arr, int left, int right) {
        int first = arr[left];
        int i = left;
        int j =right;
        while (i<j){
            while (i<j&&arr[i]<=first){
                i++;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            while (i<j&&arr[j]>=first){
                j--;
            }
            int temp1 = arr[i];
            arr[i] = arr[j];
            arr[j] = temp1;
        }
        return i;
    }
}
