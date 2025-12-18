import java.util.Scanner;

public class task2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
                "Столица Франции?",
                "Какая планета ближе всего к Солнцу?",
                "Сколько континентов на Земле?",
                "Какая химическая формула воды?",
                "В каком году началась Вторая мировая война?",
                "Самый большой океан?",
                "Автор 'Гарри Поттера'?",
                "Сколько цветов в радуге?",
                "Язык программирования, на котором мы пишем сейчас?",
                "Кто написал 'Войну и мир'?"
        };

        String[][] options = {
                {"1) Лондон", "2) Париж", "3) Берлин"},
                {"1) Венера", "2) Земля", "3) Меркурий"},
                {"1) 5", "2) 6", "3) 7"},
                {"1) H2O", "2) CO2", "3) O2"},
                {"1) 1939", "2) 1945", "3) 1914"},
                {"1) Атлантический", "2) Тихий", "3) Индийский"},
                {"1) Дж. К. Роулинг", "2) Толкин", "3) Стивен Кинг"},
                {"1) 5", "2) 6", "3) 7"},
                {"1) Java", "2) Python", "3) C++"},
                {"1) Лев Толстой", "2) Достоевский", "3) Чехов"}
        };

        int[] answers = {2, 3, 3, 1, 1, 2, 1, 3, 1, 1};
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Вопрос " + (i + 1) + ": " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Введите номер ответа: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == answers[i]) {
                score++;
            }
            System.out.println();
        }

        System.out.println("Вы ответили правильно на " + score + " из " + questions.length);

        scanner.close();
    }
}
