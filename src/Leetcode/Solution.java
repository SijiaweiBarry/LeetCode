package Leetcode;

import java.util.Scanner;

/**
 * @Author SijiaweiBarry
 * @create 2020/6/4 8:37
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String str = sc.nextLine();
            int length = str.length();
            int splitTime = length/8; //splitTime 为将str分割8个一组的次数
            int re = length%8;  //re 为8个一组分割后留下的不足8个的最后一组的长度
            if (splitTime==0){
                StringBuilder stringBuilder = new StringBuilder(str);
                for (int i = 0; i <8-length ; i++) {
                    stringBuilder.append("0");
                }
                System.out.println(stringBuilder);
                return;
            }
            for (int i = 0; i <splitTime ; i++) {
                int index = 0;
                StringBuilder stringBuilder2 = new StringBuilder(str.substring(index,index+8));
                index = index+8;
                System.out.println(stringBuilder2);
            }

        }
    }
}
