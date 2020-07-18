package DesignPattern.Singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/4/17 20:38
 */
public class Test2 {
    public static void main(String[] args) {
        int []arr = new int[15];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <arr.length ; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
