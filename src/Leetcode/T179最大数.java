package Leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/16 20:53
 */
public class T179最大数 {
    public String largestNumber(int[] nums) {
        String []str = new String[nums.length];
        for (int i = 0; i <str.length ; i++) {
            str[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String str1 = o1+o2;
                String str2 = o2+o1;
                return str2.compareTo(str1);
            }
        });
        if (str[0].equals("0")){
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : str) {
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }
}
