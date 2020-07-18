package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/29 21:24
 */
public class T459重复的子字符串 {
    public boolean repeatedSubstringPattern(String s) {
        String res = s + s;
        return res.substring(1,res.length()-1).contains(s);
    }
}
