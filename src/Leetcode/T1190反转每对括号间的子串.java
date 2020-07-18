package Leetcode;

import java.util.Stack;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/13 21:28
 */
public class T1190反转每对括号间的子串 {
    public String reverseParentheses(String s) {
        Stack<Integer>stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char[]ch = s.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            if (ch[i]=='('){
                stack.push(i);
            }
            if (ch[i]==')'){
                ch = reverse(ch,stack.pop()+1,i-1);
            }
        }
        for (int i = 0; i <ch.length ; i++) {
            if (ch[i]!='('&&ch[i]!=')'){
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
    public char[] reverse(char[]ch,int start,int end){
        while (start<end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return ch;
    }
}
