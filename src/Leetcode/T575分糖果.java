package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author SijiaweiBarry
 * @create 2020/3/5 21:24
 */
public class T575分糖果 {
    public int distributeCandies(int[] candies) {
        Map<Integer,Integer>map = new HashMap<Integer,Integer>();

        Arrays.sort(candies);
        int maxKind = candies.length/2;
        for (int i = 0; i <candies.length ; i++) {
            map.put(candies[i],map.getOrDefault(candies[i],0)+1);
        }
        int res = Math.min(maxKind,map.size());
        return res;
    }
}
