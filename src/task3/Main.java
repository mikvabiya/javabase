import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Alpinist {
    private String name;
    private int age;
    private String address;

    public Alpinist(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " (" + age + " лет, " + address + ")";
    }
}

class Mountain {
    private String name;
    private String country;
    private int height;

    public Mountain(String name, String country, int height) {
        this.name = name;
        this.country = country;
        this.height = height;
    }

    @Override
    public String toString() {
        return name + " в " + country + ", " + height + " м";
    }
}

class ClimbingGroup {
    private String groupName;
    private boolean isRecruiting;
    private Mountain mountain;
    private List<Alpinist> alpinists;

    public ClimbingGroup(String groupName, Mountain mountain, boolean isRecruiting) {
        this.groupName = groupName;
        this.mountain = mountain;
        this.isRecruiting = isRecruiting;
        this.alpinists = new ArrayList<>();
    }

    public boolean addAlpinist(Alpinist alpinist) {
        if (!isRecruiting) {
            System.out.println("Набор в группу '" + groupName + "' закрыт. " + alpinist + " не может быть добавлен.");
            return false;
        }
        alpinists.add(alpinist);
        System.out.println(alpinist + " добавлен в группу '" + groupName + "'");
        return true;
    }

    public void closeRecruitment() {
        isRecruiting = false;
    }

    public void showGroupInfo() {
        System.out.println("Группа: " + groupName);
        System.out.println("Гора: " + mountain);
        System.out.println("Набор открыт: " + (isRecruiting ? "да" : "нет"));
        System.out.println("Альпинисты:");
        if (alpinists.isEmpty()) {
            System.out.println("   (пока нет альпинистов)");
        } else {
            for (Alpinist a : alpinists) {
                System.out.println(" - " + a);
            }
        }
        System.out.println();
    }

    public String getGroupName() {
        return groupName;
    }

    public boolean getIsRecruiting() {
        return isRecruiting;
    }

    public void setRecruiting(boolean recruiting) {
        this.isRecruiting = recruiting;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Mountain everest = new Mountain("Эверест", "Непал", 8848);
        Mountain elbrus = new Mountain("Эльбрус", "Россия", 5642);
        Mountain montBlanc = new Mountain("Монблан", "Франция/Италия", 4808);

        ClimbingGroup group1 = new ClimbingGroup("Группа A", everest, random.nextBoolean());
        ClimbingGroup group2 = new ClimbingGroup("Группа B", elbrus, random.nextBoolean());
        ClimbingGroup group3 = new ClimbingGroup("Группа C", montBlanc, random.nextBoolean());

        boolean originalStatus1 = group1.getIsRecruiting();
        group1.setRecruiting(true);
        group1.addAlpinist(new Alpinist("Иван", 30, "Москва"));
        group1.addAlpinist(new Alpinist("Олег", 28, "Санкт-Петербург"));
        group1.addAlpinist(new Alpinist("Мария", 25, "Казань"));
        group1.setRecruiting(originalStatus1);

        boolean originalStatus2 = group2.getIsRecruiting();
        group2.setRecruiting(true);
        group2.addAlpinist(new Alpinist("Сергей", 32, "Новосибирск"));
        group2.addAlpinist(new Alpinist("Анна", 27, "Владивосток"));
        group2.setRecruiting(originalStatus2);

        boolean originalStatus3 = group3.getIsRecruiting();
        group3.setRecruiting(true);
        group3.addAlpinist(new Alpinist("Павел", 29, "Краснодар"));
        group3.addAlpinist(new Alpinist("Дмитрий", 31, "Екатеринбург"));
        group3.setRecruiting(originalStatus3);

        ClimbingGroup[] groups = {group1, group2, group3};

        boolean running = true;
        while (running) {
            System.out.println("Доступные группы:");
            for (int i = 0; i < groups.length; i++) {
                String recruitingStatus = groups[i].getIsRecruiting() ? "да" : "нет";
                System.out.println((i + 1) + ". " + groups[i].getGroupName() + " (Набор открыт: " + recruitingStatus + ")");
            }
            System.out.println("Введите номер группы для добавления альпиниста или 0 для выхода:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                running = false;
                break;
            }
            if (choice < 1 || choice > groups.length) {
                System.out.println("Некорректный выбор!");
                continue;
            }

            ClimbingGroup selectedGroup = groups[choice - 1];

            if (!selectedGroup.getIsRecruiting()) {
                System.out.println("Набор в эту группу закрыт!");
                continue;
            }

            System.out.println("Введите имя альпиниста:");
            String name = scanner.nextLine();

            System.out.println("Введите возраст:");
            int age = scanner.nextInt();

            if (age < 20) {
                System.out.println("Ошибка: альпинист должен быть не младше 20 лет!");
                scanner.nextLine();
                continue;
            }
            if (age > 50) {
                System.out.println("Ошибка: альпинист старше 50 лет не может быть добавлен в группу!");
                scanner.nextLine();
                continue;
            }
            scanner.nextLine();

            System.out.println("Введите адрес:");
            String address = scanner.nextLine();

            System.out.println("Есть ли у альпиниста подготовка к восхождению? (да/нет):");
            String preparation = scanner.nextLine().trim().toLowerCase();

            if (!preparation.equals("да")) {
                System.out.println("Ошибка: альпинист без подготовки не может быть добавлен в группу!");
                continue;
            }

            Alpinist newAlpinist = new Alpinist(name, age, address);
            selectedGroup.addAlpinist(newAlpinist);
        }

        System.out.println("\nИтоговая информация по группам:");
        for (ClimbingGroup g : groups) {
            g.showGroupInfo();
        }

        scanner.close();
    }
}
