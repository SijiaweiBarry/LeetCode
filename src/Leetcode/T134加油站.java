package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/4/26 16:29
 */
public class T134加油站 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int length = gas.length;
        int s = Integer.MAX_VALUE;
        int min = 0;
        int res = 0;
        for (int i = 0; i <length ; i++) {
            min += gas[i]-cost[i];
            if (min<s){
                s = min;
                res = i;
            }
        }
        return min<0?-1:(res+1)%length;
    }
}
