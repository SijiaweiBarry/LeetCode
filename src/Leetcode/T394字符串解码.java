package Leetcode;

import java.util.Stack;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/7 16:24
 */
public class T394字符串解码 {
    public String decodeString(String s) {
        if (s==null)return null;
        Stack<String>lastres = new Stack<>();
        Stack<Integer>multi = new Stack<>();
        StringBuilder res= new StringBuilder();
        int time = 0;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='['){
                lastres.add(res.toString());
                multi.add(time);
                res = new StringBuilder();
                time = 0;
            }else if (s.charAt(i)==']'){
                StringBuilder str = new StringBuilder();
                int num = multi.pop();
                for (int j = 0; j <num ; j++) {
                    str.append(res);
                }
                res = new StringBuilder(lastres.pop()+str);
            }else if (s.charAt(i)<='9'&&s.charAt(i)>='0'){
                time = time*10+Integer.parseInt(s.charAt(i)+"");
            }else res.append(s.charAt(i));
        }
        return res.toString();
    }
}
