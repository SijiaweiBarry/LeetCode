package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/10 16:05
 */
public class T301_删除无效的括号 {
    Set<String>set = new HashSet<>();
    public List<String> removeInvalidParentheses(String s) {
        if (s==null||s.length()==0) {
            return new ArrayList<>();
        }
        int openRem = 0;
        int closeRem = 0;
        char[] chars = s.toCharArray();
        for (int i = 0;i<chars.length;i++){
            if (chars[i]=='('){
                openRem++;
            }else {
                if (chars[i]==')'){
                    if (openRem>0){openRem--;}
                    else {closeRem++;}
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        backTracking(chars,openRem,closeRem,0,0,0,sb);
        return new ArrayList<>(set);
    }

    private void backTracking(char[] chars, int openRem, int closeRem, int open, int close, int index, StringBuilder path) {
        if (index==chars.length){
            if (openRem==0&&closeRem==0){
                set.add(path.toString());
            }
            return;
        }
        if ((chars[index]=='('&&openRem>0)||(chars[index]==')'&&closeRem>0)){
            backTracking(chars,openRem-(chars[index]=='('?1:0),closeRem-(chars[index]==')'?1:0),open,close,index+1,path);
        }
        path.append(chars[index]);
        if (chars[index] != '(' && chars[index] != ')') {
            backTracking(chars,openRem,closeRem,open,close,index+1,path);
        }

        if (chars[index]=='('){
            backTracking(chars,openRem,closeRem,open+1,close,index+1,path);
        }
        if (chars[index]==')'){
            if (close<open) {
                backTracking(chars, openRem, closeRem, open, close + 1, index + 1, path);
            }
        }
        path.deleteCharAt(path.length()-1);
    }
}
