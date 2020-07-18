package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/3/5 20:33
 */
public class T1103分糖果 {
    public int[] distributeCandies(int candies, int num_people) {
        int[]res = new int[num_people];
        int temp = 1;
        int sum = 0;
        int i;
        a1:while (true){
        for ( i = 0; i <res.length ; i++) {
            sum+=temp;
            if (sum>candies){
                break a1;
            }
            res[i]+=temp;
            temp++;
            }
        }
        res[i] += candies-sum+temp;
        return res;
    }
}
