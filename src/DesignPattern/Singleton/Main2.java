package DesignPattern.Singleton;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author SijiaweiBarry
 * @create 2020/4/29 19:05
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {

            Set<String> set = new TreeSet<>(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    if (o1.equals(o2)) {
                        return 0;
                    }
                    else{
                        for (int i = 0; i <Math.min(o1.length(),o2.length()) ; i++) {
                            if ((int)o1.charAt(i)>(int)o2.charAt(i)){
                                return -1;
                            }else if ((int)o1.charAt(i)<(int)o2.charAt(i)){
                                return 1;
                            }
                        }
                        return o1.length()>o2.length()?-1:1;
                    }
                }
            });
            Main2 main2 = new Main2();
            String input = sc.nextLine();
            if (input==null||input.length()==0){
                System.out.println(0);
                continue;
            }
            char[] chars = input.toCharArray();
            int[] f = new int[chars.length];
            main2.method(chars, f, set, "");
            System.out.println(set.size());

        }
    }

    private void method(char[] ori, int[] flag, Set<String> stringSet, String temp) {
        if (temp.length()==ori.length){
            stringSet.add(new String(temp));
            return;
        }
        for (int i = 0; i <ori.length ; i++) {
            if (flag[i]==0){
                temp+=ori[i];
                flag[i] = 1;
                method(ori,flag,stringSet,temp);
                temp = temp.substring(0,temp.length()-1);
                flag[i] = 0;
            }
        }
    }

}
