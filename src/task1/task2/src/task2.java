import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Ошибка: возраст не может быть отрицательным");
        } else if (age < 7) {
            System.out.println("Категория билета: детский");
        } else if (age <= 17) {
            System.out.println("Категория билета: подростковый");
        } else if (age <= 60) {
            System.out.println("Категория билета: взрослый");
        } else {
            System.out.println("Категория билета: пенсионный");
        }

        scanner.close();
    }
}
