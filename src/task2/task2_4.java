import java.util.Scanner;

public class task2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите доход за месяц (в SEK): ");
        double income = scanner.nextDouble();

        if (income <= 0) {
            System.out.println("Ошибка: доход должен быть положительным!");
            scanner.close();
            return;
        }

        double tax = 0.0;

        if (income <= 18800) {
            tax = income * 0.11;
        } else if (income <= 468700) {
            tax = 18800 * 0.11 + (income - 18800) * 0.20;
        } else if (income <= 675700) {
            tax = 18800 * 0.11 + (468700 - 18800) * 0.20 + (income - 468700) * 0.32;
        } else {
            tax = 18800 * 0.11 + (468700 - 18800) * 0.20 + (675700 - 468700) * 0.32 + (income - 675700) * 0.40;
        }

        double netIncome = income - tax;

        System.out.printf("Сумма налога: %.2f SEK%n", tax);
        System.out.printf("Итоговая сумма после вычета налога: %.2f SEK%n", netIncome);

        scanner.close();
    }
}