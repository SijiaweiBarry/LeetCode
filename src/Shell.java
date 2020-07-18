import java.util.Scanner;

public class Shell {
    public static int[] result(int arr[],int step[]){
        for (int i = 0; i <step.length ; i++) {
            int step1=step[i];
            int temp=0;
            int k=0;
            for ( int j = step1; j <arr.length ; j++) {
                temp=arr[j];
                for (k = j; k >=step1 ; k-=step1) {
                    if (arr[k-step1]>temp){
                        arr[k]=arr[k-step1];
                    }else {
                        break;
                    }
                }
                arr[k]=temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testnum=Integer.parseInt(sc.nextLine());
        for (int i = 0; i <testnum ; i++) {
            String str[]=sc.nextLine().split(" ");
            String str2[]=sc.nextLine().split(" ");
            int arr[]=new int[str.length];
            for (int j = 0; j <arr.length ; j++) {
                arr[j]=Integer.parseInt(str[j]);
            }
            int step[]=new int[str2.length];
            for (int j = 0; j <step.length ; j++) {
                step[j]=Integer.parseInt(str2[j]);
            }
            int resultarr[]=result(arr,step);
            String r="";
            for (int j = 0; j <resultarr.length ; j++) {
                r+=resultarr[j]+" ";
            }
            System.out.println(r.trim());
        }
    }
}
