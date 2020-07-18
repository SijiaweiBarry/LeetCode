import java.util.Scanner;

public class ArrayQuery {
    public static int sum(int n,int arr[]){
        int f[]=new int[n];
        int g[]=new int[n];
        f[0]=arr[0];
        g[0]=-10000;
        int res=Integer.MIN_VALUE;
        for (int i = 1; i <n ; i++) {
            f[i]=Math.max(f[i-1]+arr[i],arr[i]);
            g[i]=Math.max(g[i-1]+arr[i],f[i-1]);
        }
        for (int i = 0; i <n ; i++) {
            res=Math.max(res,Math.max(f[i],g[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int testnum=scanner.nextInt();
        for (int i = 0; i <testnum ; i++) {
            int n=scanner.nextInt();
            int arr[]=new int[n];
            for (int j = 0; j <n ; j++) {
                arr[j]=scanner.nextInt();
            }
            System.out.println(sum(n,arr));
        }
    }
}
