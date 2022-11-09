import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер списка:");

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("Введите верхнюю границу для значений:");

        int m = Integer.parseInt(scanner.nextLine());

        logger.log("Создаём и наполняем список");

        List<Integer> listInt = new ArrayList<>();

        System.out.print("Вот случайный список: ");

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int value = random.nextInt(m);
            listInt.add(value);
            System.out.print(value + " ");
        }
        System.out.println();

        logger.log("Просим пользователя ввести входные данные для фильтрации");

        int f = Integer.parseInt(scanner.nextLine());

        Filter filter = new Filter(f);

        logger.log("Запускаем фильтрацию");
        List<Integer> result = filter.filterOut(listInt);

        logger.log("Выводим результат на экран");

        System.out.print("Отфильтрованный список: ");
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
        System.out.println();

        logger.log("Завершаем программу");
    }
}
