import java.util.Scanner;
import java.util.Locale;

public class task2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Введите массу тела (кг): ");
        double m = scanner.nextDouble();

        System.out.print("Введите рост (м): ");
        double h = scanner.nextDouble();

        double I = m / (h * h);

        System.out.println("Индекс массы тела: " + I);

        if (I <= 16) {
            System.out.println("Выраженный дефицит массы тела");
        } else if (I <= 18.5) {
            System.out.println("Дефицит массы тела");
        } else if (I <= 25) {
            System.out.println("Норма");
        } else if (I <= 30) {
            System.out.println("Избыточная масса тела (предожирение)");
        } else if (I <= 35) {
            System.out.println("Ожирение 1-й степени");
        } else if (I <= 40) {
            System.out.println("Ожирение 2-й степени");
        } else {
            System.out.println("Ожирение 3-й степени");
        }

        scanner.close();
    }
}
