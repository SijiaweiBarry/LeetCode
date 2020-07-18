import java.util.*;
import java.util.Scanner;

public class Test {
    public static int DFS(int edges[][],int n,int start){
        boolean visted[]=new boolean[n];
        Stack<Integer>stack= new Stack<Integer>();
        visted[start]=true;
        stack.add(start);
        int count=0;
        while(!stack.isEmpty()){
            count=Math.max(count,stack.size());
            int current=stack.peek();
            for (int i = 0; i <n ; i++) {
                if (edges[current][i]==1&&!visted[i]){
                    stack.push(i);
                    visted[i]=true;
                    break;
                }
                if (i==n-1){
                    stack.pop();
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testnum=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <testnum ; i++) {
            String str1[]=scanner.nextLine().split(" ");
            int n=Integer.parseInt(str1[0]);
            int edges[][]=new int[n][n];
            int start=str1[1].charAt(0)-97;
            scanner.nextLine();
            for (int j = 0; j <n ; j++) {
                String str[]=scanner.nextLine().substring(2).split(" ");
                for (int k = 0; k <n ; k++) {
                    edges[j][k]=Integer.parseInt(str[k]);
                }

            }
            System.out.println(DFS(edges,n,start));
        }
    }
}











 /* int n = scanner.nextInt();
                int[] arr = new int[n+1];
                arr[0]=n;
                for (int i = 1; i < n+1; i++) {
                    arr[i] = scanner.nextInt();
                }

                quickSort(arr,0,n-1);
                for (int i = 0; i < arr.length; i++) {
                    if (i < n - 1) {
                        System.out.print(arr[i] + " ");
                    } else
                        System.out.println(arr[i]);
                }*/



   /* public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int testnum=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <testnum ; i++) {
            String str=scanner.nextLine();
            char ch[]=str.toCharArray();
            int arr[]=new int[ch.length];
            for (int j = 0; j <ch.length ; j++) {
                arr[j]=ch[j]-'0';
            }
            System.out.println(result(arr));
        }

    }*/



