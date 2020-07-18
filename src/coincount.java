import java.util.*;
public class coincount {
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        int testnum=Integer.parseInt(reader.nextLine());
        while(testnum-->0){
            String[] str=reader.nextLine().split(" ");
            int coinnum=Integer.parseInt(str[0]);
            int valueSum=Integer.parseInt(str[1]);
            String[] vtr=reader.nextLine().split(" ");
            int[] value=new int[coinnum];
            for(int i=0;i<vtr.length;i++){
                value[i]=Integer.parseInt(vtr[i]);
            }
            System.out.println(CoinCount(value,valueSum,coinnum));
        }
    }

    private static int CoinCount(int[] value, int valueSum,int coinnum) {
        int i;
        for(i=1;i<=coinnum;i++)
        {
            if(valueSum>value[coinnum-i])
            {
                int b=CoinCount(value,valueSum-value[coinnum-i],coinnum);
                if (b!=-1)
                    return 1+b;
            }
            else if (valueSum==value[coinnum-i])
                return 1;
        }
        return -1;
    }
}
