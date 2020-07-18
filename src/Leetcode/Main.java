package Leetcode;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            if (str.length()==0||str==null){
                System.out.println(false);
                return;
            }
            char[] chars = str.toCharArray();
            int i = 0;
            int j = chars.length - 1;
            if (isValid(chars,i,j)){
                System.out.println(str.substring(i,j+1));
                return;
            }

            for (int k = 0; k < chars.length; k++) {
                List<Character>list = new ArrayList<>();
                for (int m = 0; m < chars.length; m++) {
                    list.add(chars[m]);
                }
                list.remove(k);
                char[]temp = new char[list.size()];
                for (int l = 0; l < temp.length; l++) {
                    temp[l] = list.get(l);
                }

                if (isValid(temp,0,temp.length-1)){
                    System.out.print(temp);
                    return;
                }
            }


            System.out.println(false);
        }
    }

    private static boolean isValid(char[] chars, int i, int j) {
        while (i<j){
            if (chars[i]!=chars[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
