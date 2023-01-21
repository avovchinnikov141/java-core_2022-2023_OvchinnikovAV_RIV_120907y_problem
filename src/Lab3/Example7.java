package Lab3;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
   //     System.out.println("Введите количество числел:");
     //   int n = in.nextInt();
        int[] arr = new int[10];
     //   int b=0;

        for (i = 0; i < arr.length;) {
            //   System.out.printf("Введите число, кторое делится на 5 с остатком 2 или при делении на 3 в остатке получается 1 %d \n",i);
            System.out.printf("Введите число, кторое делится на 5 с остатком 2(Правильно введенных числел = %d из 10)\n", i );
            arr[i] = in.nextInt();
            //       System.out.printf("%d ",i);
            if(arr[i]%5 == 2){
             //   b+=arr[i];
                i++;
            }else System.out.printf("\nВведите корректное значение\n");
            if(i == arr.length) break;

        }
        System.out.printf("Введите число, кторое делится на 5 с остатком 2(Правильно введенных числел = %d из 10)\n", i );
        in.close();
    }





}
