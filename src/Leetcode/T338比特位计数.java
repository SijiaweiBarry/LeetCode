package Leetcode;

public class T338比特位计数 {
    public static int[] countBits(int num) {
        int count[]=new int[num+1];
        for (int i = 0; i <=num ; i++) {
            int c = 0;
            int j=i;
            while (j>0){
                if ((j&1)==1){
                    c++;
                }
                j=j>>1;
            }
            count[i]=c;
        }
        return count;
    }
}
