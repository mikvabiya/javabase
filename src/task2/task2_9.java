import java.util.Scanner;

public class task2_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] expenses = new double[7];  // Расходы за 7 дней (индексы 0-6 для дней 1-7)
        double usdRate = 79.05;  // Курс USD к RUB (1 USD = 79.05 RUB)
        double eurRate = 94.51;  // Курс EUR к RUB (1 EUR = 94.51 RUB)

        while (true) {
            System.out.println("\n=== Учёт расходов за неделю ===");
            System.out.println("\nМеню:");
            System.out.println("1. Внести расходы за день");
            System.out.println("2. Вывести итоговую сумму за неделю (в RUB)");
            System.out.println("3. Конвертировать итоговую сумму в USD");
            System.out.println("4. Конвертировать итоговую сумму в EUR");
            System.out.println("0. Выход");
            System.out.print("Выберите опцию: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Выход из программы.");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Введите номер дня (1-7): ");
                    int day = scanner.nextInt();
                    if (day < 1 || day > 7) {
                        System.out.println("Ошибка: день должен быть от 1 до 7!");
                        break;
                    }
                    System.out.print("Введите сумму расходов за день " + day + " (в RUB): ");
                    double amount = scanner.nextDouble();
                    if (amount < 0) {
                        System.out.println("Ошибка: сумма не может быть отрицательной!");
                        break;
                    }
                    expenses[day - 1] = amount;
                    System.out.println("Расходы за день " + day + " сохранены.");
                    break;

                case 2:
                    double total = calculateTotal(expenses);
                    System.out.printf("Итоговая сумма за неделю: %.2f RUB%n", total);
                    break;

                case 3:
                    total = calculateTotal(expenses);
                    double inUsd = total / usdRate;
                    System.out.printf("Итоговая сумма в USD: %.2f USD (по курсу 1 USD = %.2f RUB)%n", inUsd, usdRate);
                    break;

                case 4:
                    total = calculateTotal(expenses);
                    double inEur = total / eurRate;
                    System.out.printf("Итоговая сумма в EUR: %.2f EUR (по курсу 1 EUR = %.2f RUB)%n", inEur, eurRate);
                    break;

                default:
                    System.out.println("Неверный выбор! Попробуйте снова.");
            }
        }

        scanner.close();
    }

    private static double calculateTotal(double[] expenses) {
        double sum = 0;
        for (double exp : expenses) {
            sum += exp;
        }
        return sum;
    }
}
