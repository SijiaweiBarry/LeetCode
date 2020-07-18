package Leetcode;

import java.util.Arrays;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/22 21:28
 */
public class T557翻转字符串中的单词3 {
    public String reverseWords(String s) {
        String str[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <str.length ; i++) {
            StringBuilder sb1 = new StringBuilder(str[i]);
            sb.append(sb1.reverse());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
