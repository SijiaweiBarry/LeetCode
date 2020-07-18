import java.util.*;

public class Jishupaixu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        int testnum=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <testnum ; i++) {
            int count = 1;
            String str[] = scanner.nextLine().split(",");
            int max = 0;
            for (int j = 0; j < str.length; j++) {
                max = Math.max(Math.max(max, (int) str[j].charAt(0)), (int) str[j].charAt(2));
            }
            int[] arr = new int[max - 97 + 1];
            for (int j = 0; j < str.length; j++) {
                arr[(int) str[j].charAt(2) - 97]++;
            }
            int num = arr.length;

            while (num > 0) {
                List<Integer> list = new ArrayList<>();

                int temp = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == 0) {
                        num -= 1;
                        arr[j] = -1;
                        temp += 1;
                        list.add(j);
                    }
                }
                for (int j = 0; j <list.size() ; j++) {
                    for (int k = 0; k < str.length; k++) {
                        if ((int) str[k].charAt(0) - 97 == list.get(j)) {
                            arr[(int) str[k].charAt(2) - 97] -= 1;
                        }
                    }
                }
                count *= temp;
            }
            System.out.println(count);
        }
    }

}
