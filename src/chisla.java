import java.util.Scanner;

public class chisla {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int a = scanner.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        int c = a % 10;
        while (a != 0) {
            //сумма цифр числа
            sum1 = sum1 + a % 10;

            //сумма нечетных цифр числа
            if ((a % 10) % 2 == 1) {
                sum2 = sum2 + a % 10;
            }
            a = (a - a % 10) / 10;
            //найти максимальную цифру числа
            if (c < a % 10) {
                c = a % 10;
            }
        }
        System.out.println("Сумма цифр числа " + sum1);
        System.out.println("Сумма нечентных цифр числа " + sum2);
        System.out.println("Максимальная цифра числа " + c);
    }

}