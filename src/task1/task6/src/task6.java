import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество торпед n: ");
        int n = scanner.nextInt();

        System.out.print("Введите вероятность попадания торпеды p (в процентах, 0-100): ");
        double p = scanner.nextDouble() / 100;

        System.out.print("Введите вероятность затопления подводной лодки p1 (в процентах, 0-100): ");
        double p1 = scanner.nextDouble() / 100;

        double probabilityA = p * p1;
        double q = (1 - p) / (1 - p1);

        System.out.printf("Вероятность P(A) = %.4f\n", probabilityA);
        System.out.printf("Значение q = %.4f\n", q);

        scanner.close();
    }
}
