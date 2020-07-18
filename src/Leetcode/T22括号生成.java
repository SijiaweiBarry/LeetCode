package Leetcode;

import java.util.ArrayList;
import java.util.List;


public class T22括号生成 {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        String par = "";

        generate(0,0,par,n);
        return res;
    }
    public void generate(int leftNum,int rightNum,String par,int n){
        if (leftNum==n&&rightNum==n){
            res.add(par);
            return;
        }
        if (leftNum<n){
            generate(leftNum+1,rightNum,par+"(",n);
        }
        if (rightNum<leftNum){
            generate(leftNum,rightNum+1,par+")",n);
        }
    }
}
