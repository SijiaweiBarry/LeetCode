package Leetcode;

import java.util.Arrays;

/**
 * @Author SijiaweiBarry
 * @create 2020/4/24 15:46
 */
public class T14最长公共前缀 {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuffer sb = new StringBuffer("");
        int first = strs[0].length();
        int last = strs[strs.length-1].length();
        for (int i = 0; i <Math.min(first,last) ; i++) {
            if (strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
                sb.append(strs[0].charAt(i));
            }else {
                break;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[]strings = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strings));
    }
}
