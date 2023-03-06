public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начало диапазона ");
        int firstNumber = scanner.nextInt();
        System.out.print("Введите конец диапазона ");
        int lastNumber = scanner.nextInt();
        int amountAll = 0;
        int amountEven = 0;
        int count = 0;

        for (int i = firstNumber; i <= lastNumber; i++) {
            //сумма всех чисел диапазона
            amountAll = amountAll + i;
            //сумма четных чисел диапазона
            if (i % 2 == 0) {
                amountEven = amountEven + i;
                count++;
            }
        }
        double averageAll = (double) amountAll / (lastNumber - firstNumber + 1);
        double averageEven = (double) amountEven / count;
        System.out.println("Среднее арифметическое чисел дипазаона = " + averageAll);
        System.out.println("Среднее арифметическое четных чисел диапазона = " + averageEven);
    }
}
