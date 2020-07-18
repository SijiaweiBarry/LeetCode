package DesignPattern.Singleton;



import java.util.*;
public class Main {
    public static String longestPalindrome(String s) {
        int length = s.length();
        String res = "";
        boolean dp[][] = new boolean[length][length];
        for (int len = 1; len <=length ; len++) {
            for (int start = 0; start < length ; start++) {
                int end = start + len -1;
                if (end >= length){
                    break;
                }
                dp[start][end] = (len==1||len==2||dp[start+1][end-1])&&(s.charAt(start)==s.charAt(end));
                if (dp[start][end]&&len>res.length()){
                    res = s.substring(start,end+1);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            if(s==null||s.length()==0){
                System.out.println("");
                return;
        }
            String s1 = longestPalindrome(s);
            int length = s.length()-s1.length();
            if (length==0){
                System.out.println(s1);
                return;
            }else {
                StringBuilder sb = new StringBuilder(s);
                StringBuilder res = new StringBuilder("");
                for (int i = 0; i <length ; i++) {
                    res.append(s.charAt(s.length()-1-i));
                }
                res.append(sb);
                System.out.println(res);
            }
    }


}

