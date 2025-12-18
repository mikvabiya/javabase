import java.util.Scanner;

public class task2_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество тарелок: ");
        int plates = scanner.nextInt();

        System.out.print("Введите количество моющего средства: ");
        double detergent = scanner.nextDouble();

        if (plates < 0 || detergent < 0) {
            System.out.println("Ошибка: количество тарелок и средства не могут быть отрицательными!");
            scanner.close();
            return;
        }

        double spentPerPlate = 0.5;
        int washed = 0;

        System.out.println("Начинаем мыть тарелки...");

        while (plates > 0 && detergent >= spentPerPlate) {
            detergent -= spentPerPlate;
            washed++;
            plates--;

            System.out.printf("Помыта тарелка %d, осталось моющего средства: %.1f%n", washed, detergent);
        }

        if (plates > 0) {
            System.out.printf("Моющее средство закончилось! Успели помыть только %d тарелок. Осталось непомытых тарелок: %d%n", washed, plates);
        } else {
            System.out.printf("Все тарелки помыты! Осталось моющего средства: %.1f%n", detergent);
        }

        scanner.close();
    }
}