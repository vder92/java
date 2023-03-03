import java.util.Scanner;

public class average_calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начало диапазона ");
        int a = scanner.nextInt();
        System.out.print("Введите конец диапазона ");
        int b = scanner.nextInt();
        double sum1 = 0;
        double sum2 = 0;
        double result1 = 0;
        double result2 = 0;
        int d = 0;

        for (int i = a; i <= b; i++) {
            //сумма всех чисел диапазона
            sum1 = sum1 + i;
            //сумма четных чисел диапазона
            if (i % 2 == 0) {
                sum2 = sum2 + i;
                d++;
            }
        }
        result1 = sum1 / (b - a + 1);
        result2 = sum2 / d;
        System.out.println("Среднее арифметическое чисел дипазаона = " + result1);
        System.out.println("Среднее арифметическое четных чисел диапазона = " + result2);
    }
}
