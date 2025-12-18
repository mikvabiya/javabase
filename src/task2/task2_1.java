import java.util.Random;

public class task2_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int color = random.nextInt(3);

        switch (color) {
            case 0:
                System.out.println("Красный");
                break;
            case 1:
                System.out.println("Зеленый");
                break;
            case 2:
                System.out.println("Желтый");
                break;
        }
    }
}
