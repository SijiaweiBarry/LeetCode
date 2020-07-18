package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/22 22:03
 */
public class T186翻转字符串里的单词 {
    public void reverseWords(char[] s) {
        if (s==null||s.length==0)return;
        reverse(s,0,s.length-1);
        int start= 0;
        for (int i = 0; i <s.length ; i++) {
            if (s[i]!=' ')continue;
            reverse(s,start,i-1);
            start=i+1;
        }
        reverse(s,start,s.length-1);
    }
    public void reverse(char[]s ,int start,int end){
        while (start<end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}


