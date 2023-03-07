import java.util.Scanner;

public class Main_Person {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя ");
        String name = scanner.nextLine();

        System.out.print("Введите отчество ");
        String middleName = scanner.nextLine();

        System.out.print("Введите фамилию ");
        String familyName = scanner.nextLine();

        System.out.print("Введите возраст ");
        int age = scanner.nextInt();

        Person man = new Person(name, middleName, familyName, age);

        System.out.println("Начальное имя " + man.getName());

        man.setName("Василий");

        System.out.println("Измененное имя " + man.getName());

        System.out.println("Год рождения " + man.bornYear(age));

        System.out.println(man);
    }
}
