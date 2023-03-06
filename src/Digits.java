import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int number = Math.abs(scanner.nextInt());
        int digitAmount = 0;
        int oddAmount = 0;
        int maxDigit = number % 10;
        while (number != 0) {
            //сумма цифр числа
            digitAmount = digitAmount + number % 10;

            //сумма нечетных цифр числа
            if ((number % 10) % 2 == 1) {
                oddAmount = oddAmount + number % 10;
            }
            number = (number - number % 10) / 10;
            //найти максимальную цифру числа
            if (maxDigit < number % 10) {
                maxDigit = number % 10;
            }
        }
        System.out.println("Сумма цифр числа " + digitAmount);
        System.out.println("Сумма нечентных цифр числа " + oddAmount);
        System.out.println("Максимальная цифра числа " + maxDigit);
    }
}
