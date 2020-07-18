package Leetcode;

import java.util.Arrays;

/**
 * @Author SijiaweiBarry
 * @create 2020/4/25 17:39
 */
public class T242有效的字母异位词 {
    public static boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n!=m){return false;}
        char[]s1=s.toCharArray();
        char[]t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        for(int i=0;i<s.length();i++){
            if(s1[i]!=t1[i]){return false;}
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "a";
        String t = "b";
        System.out.println(isAnagram(s,t));
    }
}
