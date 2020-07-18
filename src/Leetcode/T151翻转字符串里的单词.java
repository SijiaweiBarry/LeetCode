package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/22 20:52
 */
public class T151翻转字符串里的单词 {
    public String reverseWords(String s) {
        if (s.length()==0||s==null){
            return null;
        }
        String s1 = s.trim();
        StringBuilder sb = new StringBuilder();
        String str[] = s1.split(" ");
        for (int i = str.length-1; i >=0 ; i--) {
            if (str[i].equals("")){
                continue;
            }
            sb.append(str[i]);
        }
        return sb.toString();
    }
}
