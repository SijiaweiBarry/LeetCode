package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/31 9:09
 */
public class T1054_距离相等的条形码 {
    public static int[] rearrangeBarcodes(int[] barcodes) {
        int []ans = new int[barcodes.length];
        int times[] = new int[5];
        for(int i = 0 ; i < barcodes.length ; i++){
            times[barcodes[i]]+=10000;
        }
        for(int i = 0 ; i < times.length ; i++){
            times[i]+=i;
        }
        Arrays.sort(times);
        List<List<Integer>>list = new ArrayList<>();
        int index = 1;
        for(int i = 0;i < times.length;i++){
            int time = times[i]/10000;
            for(int j = 0; j < time ; j++){
                if(index>=ans.length){
                    index = 0;
                }
                ans[index] = times[i]%10000;
                index+=2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int []test = {1,1,1,2,2,2};
        int []ans = rearrangeBarcodes(test);
        for (int an : ans) {
            System.out.println(an);
            int pow = (int) Math.pow(1, 2);
        }
    }
}
