import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TimeSpe2 {
    public static int[] sort(int arr[]){
        List<Integer>list=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            list.add(arr[i]);
        }
        Collections.sort(list);
        for (int i = 0; i <list.size() ; i++) {
            arr[i]=list.get(i);
        }
        return arr;
    }
    public static int platformnum(int arrive[],int dep[]){
        int i=0;
        int j=0;
        int count=0;
        int max=Integer.MIN_VALUE;

        int arr[]=sort(arrive);
        int de[]=sort(dep);
        while (i<=arr.length-1){
            if (arr[i]<de[j]){
                count++;
                i++;


            }
            else if (arr[i]>de[j]){
                count--;
                j++;

            }else {
                i++;
                j++;
            }
            max=Math.max(max,count);

        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testnum=scanner.nextInt();
        for (int i = 0; i <testnum ; i++) {
            int num=scanner.nextInt();
            int ar[]=new int[num];
            int de[]=new int[num];
            for (int j = 0; j <ar.length ; j++) {
                ar[j]=scanner.nextInt();
            }
            for (int j = 0; j <de.length ; j++) {
                de[j]=scanner.nextInt();
            }

            System.out.println(platformnum(ar,de));
        }
    }
}
