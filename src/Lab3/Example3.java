package Lab3;
import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число от 1 до 7:");
        int a = in.nextInt();
        if (a>=1 || a<=7) {
            switch (a) {
                case 1: System.out.printf("Понедельник");
                break;
                case 2: System.out.printf("Вторник");
                    break;
                case 3: System.out.printf("Среда");
                    break;
                case 4: System.out.printf("Четверг");
                    break;
                case 5: System.out.printf("Пятница");
                    break;
                case 6: System.out.printf("Суббота");
                    break;
                case 7: System.out.printf("Воскресенье");
                    break;
                default: System.out.printf("Неверное число");
            }
            }
                in.close();

    }
}