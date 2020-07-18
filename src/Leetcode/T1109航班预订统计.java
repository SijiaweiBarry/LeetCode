package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/5/22 21:38
 */
public class T1109航班预订统计 {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int count[] = new int[n];
        for (int[]book:bookings) {
            count[book[0]-1]+=book[2];
            if (book[1]<n){
                count[book[1]]-=book[2];
            }
        }
        for (int i = 1; i <n ; i++) {
            count[i]+=count[i-1];
        }
        return count;
    }
}
