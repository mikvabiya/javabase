import java.util.Random;
import java.util.Scanner;

public class task2_6 {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Я загадал число от 1 до 100. У тебя есть 3 попытки угадать!");

        boolean guessed = false;

        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Попытка " + attempt + ": Введите ваше число: ");
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Поздравляю! Вы угадали число " + secretNumber + " с " + attempt + "-й попытки!");
                guessed = true;
                break;
            } else if (guess < secretNumber) {
                System.out.println("Загаданное число больше!");
            } else {
                System.out.println("Загаданное число меньше!");
            }
        }

        if (!guessed) {
            System.out.println("Попытки закончились. Загаданное число было: " + secretNumber);
        }

        scanner.close();
    }
}