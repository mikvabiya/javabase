import java.util.ArrayList;
import java.util.Scanner;

public class task2_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> movies = new ArrayList<>();
        final int MAX_MOVIES = 30;

        System.out.println("Добавляйте фильмы в список для просмотра (максимум " + MAX_MOVIES + ").");
        System.out.println("Для завершения ввода просто нажмите Enter (пустая строка).");

        while (movies.size() < MAX_MOVIES) {
            System.out.print("Введите название фильма: ");
            String movie = scanner.nextLine().trim();

            if (movie.isEmpty()) {
                System.out.println("Ввод завершён.");
                break;
            }

            movies.add(movie);
            System.out.println("Фильм \"" + movie + "\" добавлен. В списке: " + movies.size() + "/" + MAX_MOVIES);
        }

        if (movies.size() == MAX_MOVIES) {
            System.out.println("Список заполнен до максимума!");
        }

        // Вывод списка фильмов
        System.out.println("\nВаш список фильмов для просмотра:");
        if (movies.isEmpty()) {
            System.out.println("Список пуст.");
        } else {
            for (int i = 0; i < movies.size(); i++) {
                System.out.println((i + 1) + ". " + movies.get(i));
            }
            System.out.println("Всего фильмов: " + movies.size());
        }

        scanner.close();
    }
}