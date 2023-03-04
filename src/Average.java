import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начало диапазона ");
        int a = scanner.nextInt();
        System.out.print("Введите конец диапазона ");
        int b = scanner.nextInt();
        int amountAll = 0;
        int amountEven = 0;
        int d = 0;

        for (int i = a; i <= b; i++) {
            //сумма всех чисел диапазона
            amountAll = amountAll + i;
            //сумма четных чисел диапазона
            if (i % 2 == 0) {
                amountEven = amountEven + i;
                d++;
            }
        }
        double averageAll = (double) amountAll / (b - a + 1);
        double averageEven = (double) amountEven / d;
        System.out.println("Среднее арифметическое чисел дипазаона = " + averageAll);
        System.out.println("Среднее арифметическое четных чисел диапазона = " + averageEven);
    }
}