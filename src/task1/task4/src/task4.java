import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальную скорость (м/с): ");
        double v0 = scanner.nextDouble();

        System.out.print("Введите время полета (с): ");
        double t = scanner.nextDouble();

        System.out.print("Введите ускорение свободного падения (м/с^2): ");
        double g = scanner.nextDouble();

        double h = v0 * t - (g * t * t) / 2;

        System.out.println("Высота: " + h + " м");

        scanner.close();
    }
}
