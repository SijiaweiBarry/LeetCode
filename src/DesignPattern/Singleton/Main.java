package DesignPattern.Singleton;



import sun.reflect.generics.tree.Tree;

import java.util.*;
public class Main {

    public static int[] solution(int[]nums){
        int []res = new int[nums.length];
        for (int i = res.length-2; i >=0 ; i--) {
            for (int j = i+1; j < res.length; j+=res[j]) {
                if (nums[i]<nums[j]){
                    res[i] = j-i;
                    break;
                }else if (res[j]==0){
                    res[i] = 0;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int []test = new int[]{23,24,25,21,19,22,26,23};
        int[] solution = solution(test);
        for (int i : solution) {
            System.out.println(i);
        }
    }
}