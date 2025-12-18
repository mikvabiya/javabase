import java.util.Random;

public class task3 {
    public static void main(String[] args) {

        Random random = new Random();

        // Случайное число от 1 до 100
        int score = random.nextInt(100) + 1;

        System.out.println("Баллы за тест: " + score);

        if (score >= 90) {
            System.out.println("Оценка: отлично");
        } else if (score >= 60) {
            System.out.println("Оценка: хорошо");
        } else if (score >= 40) {
            System.out.println("Оценка: удовлетворительно");
        } else {
            System.out.println("Оценка: неудовлетворительно");
        }
    }
}
