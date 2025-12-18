import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальную скорость (м/с): ");
        double v0 = scanner.nextDouble();

        System.out.print("Введите угол броска к горизонту (градусы): ");
        double angleDeg = scanner.nextDouble();
        double angleRad = Math.toRadians(angleDeg);

        double g = 9.8;

        double totalTime = (2 * v0 * Math.sin(angleRad)) / g;
        System.out.println("Время полета тела: " + totalTime + " с");

        System.out.print("Введите момент времени (не превышающий время полета): ");
        double t = scanner.nextDouble();

        if (t < 0 || t > totalTime) {
            System.out.println("Ошибка: время должно быть в диапазоне от 0 до " + totalTime);
        } else {
            double x = v0 * Math.cos(angleRad) * t;
            double y = v0 * Math.sin(angleRad) * t - (g * t * t) / 2;

            System.out.println("Координаты тела в момент времени " + t + " с:");
            System.out.println("x = " + x + " м");
            System.out.println("y = " + y + " м");
        }

        scanner.close();
    }
}
