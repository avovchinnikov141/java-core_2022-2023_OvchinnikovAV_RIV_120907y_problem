package Lab3;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число:");
        // int n = in.nextInt();
        int[] arr = new int[2];
        for (int i = 0; i < arr.length; ++i) {
            System.out.printf("Введите число %d \n",i+1);
            arr[i] = in.nextInt();
            if (i==1) {
                if (arr[i] < arr[i-1]) System.out.printf("%d %d",arr[i],arr[i-1]); else System.out.printf("%d %d",arr[i-1],arr[i]);
            }
            }
        in.close();
        }





    }
