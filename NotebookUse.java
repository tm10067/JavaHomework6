package JavaHomework6;

//     Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//     Создать множество ноутбуков (ArrayList).
//     Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
//     Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
//     Выводить только те ноутбуки, что соответствуют условию

import JavaHomework6.Notebook;
import JavaHomework6.NotebookSearcher;
import java.util.ArrayList;
import java.util.Scanner;

//     Этот класс служит для работы с ноутбуками и поиском

public class NotebookUse {

    public static void main(String[] args) {

        // Создаем несколько экземпляров ноутбуков:

        Notebook nbk_JT0098E06RU = new Notebook("Thunderobot 911 Air D", "черный", 15.6, "Intel", "Core i5-11260H", 2.6, "Nvidia", "GeForce GTX 1650", 4.0, "DDR4", 8.0, "SSD", 256, 59999.0);
        Notebook nbk_82FG0165US = new Notebook("Lenovo IdeaPad 5 15ITL05", "синий", 15.6, "Intel", "Core i5-1135G7", 2.4, "Intel", "Iris Xe Graphics", 0.0, "DDR4", 8.0, "SSD", 256, 49999.0);
        Notebook nbk_HYMW56 = new Notebook("Honor MagicBook 16 R5/16/512", "серый", 16.1, "AMD", "Ryzen 5 5600H", 3.3, "AMD", "Radeon Graphics", 0.0, "DDR4", 16.0, "SSD", 512, 59999.0);
        Notebook nbk_MGND3 = new Notebook("Apple MacBook Air 13 M1/8/256GB", "золотой", 13.3, "Apple", "Apple M1", 3.2, "Apple", "Apple M1", 0.0, "DDR4", 8.0, "SSD", 256, 80999.0);
        Notebook nbk_197V0EA = new Notebook("HP 250 G7", "серый", 15.6, "Intel", "Celeron N4020", 1.1, "Intel", "UHD Graphics 600", 0.0, "DDR4", 4.0, "HDD", 1024, 17999.0);

        // Создаем список ноутбуков и добавляем в него экземпляры:

        ArrayList<Notebook> inventory = new ArrayList<>();
        inventory.add(nbk_JT0098E06RU);
        inventory.add(nbk_82FG0165US);
        inventory.add(nbk_197V0EA);
        inventory.add(nbk_HYMW56);
        inventory.add(nbk_MGND3);

        // Спрашиваем критерии поиска и отфильтровываем экземпляры из списка:

        System.out.println("Задайте параметры поиска (для пропуска нажмите Enter): ");
        ArrayList<Notebook> result = new NotebookSearcher()
                .setModel(askModel())
                .setColor(askColor())
                .setMin_screen_size(askMin_screen_size())
                .setMax_screen_size(askMax_screen_size())
                .setProc_brand(askProc_brand())
                .setProc_model(askProc_model())
                .setMin_proc_freq(askMin_proc_freq())
                .setMax_proc_freq(askMax_proc_freq())
                .setGpu_brand(askGpu_brand())
                .setGpu_model(askGpu_model())
                .setMin_gpu_memory(askMin_gpu_memory())
                .setMax_gpu_memory(askMax_gpu_memory())
                .setRam_type(askRam_type())
                .setMin_ram_memory(askMin_ram_memory())
                .setMax_ram_memory(askMax_ram_memory())
                .setHdd_type(askHdd_type())
                .setMin_hdd_memory(askMin_hdd_memory())
                .setMax_hdd_memory(askMax_hdd_memory())
                .setMin_price(askMin_price())
                .setMax_price(askMax_price())
                .Search(inventory);
        Notebook.printInventory(result);
    }

    // Группа методов для запроса критериев поиска

    private static String askModel() {
        System.out.print("введите модель ноутбука: ");
        String input = askString();
        return input;
    }
    private static String askProc_brand() {
        System.out.print("введите бренд процессора: ");
        String input = askString();
        return input;
    }
    private static String askProc_model() {
        System.out.print("введите модель процессора: ");
        String input = askString();
        return input;
    }
    private static String askGpu_brand() {
        System.out.print("введите бренд видеокарты: ");
        String input = askString();
        return input;
    }
    private static String askGpu_model() {
        System.out.print("введите модель видеокарты: ");
        String input = askString();
        return input;
    }
    private static String askRam_type() {
        System.out.print("введите тип ОЗУ: ");
        String input = askString();
        return input;
    }
    private static String askHdd_type() {
        System.out.print("введите тип жесткого диска: ");
        String input = askString();
        return input;
    }
    private static String askColor() {
        System.out.print("введите цвет ноутбука: ");
        String input = askString();
        return input;
    }
    private static double askMax_screen_size() {
        System.out.print("введите максимальную диагональ экрана: ");
        double input = askDouble();
        return input;
    }
    private static double askMin_screen_size() {
        System.out.print("введите минимальную диагональ экрана: ");
        double input = askDouble();
        return input;
    }
    private static double askMax_proc_freq() {
        System.out.print("введите максимальную частоту процессора: ");
        double input = askDouble();
        return input;
    }
    private static double askMin_proc_freq() {
        System.out.print("введите минимальную частоту процессора: ");
        double input = askDouble();
        return input;
    }
    private static double askMax_ram_memory() {
        System.out.print("введите максимальный объем ОЗУ: ");
        double input = askDouble();
        return input;
    }
    private static double askMin_ram_memory() {
        System.out.print("введите минимальный объем ОЗУ: ");
        double input = askDouble();
        return input;
    }
    private static double askMax_gpu_memory() {
        System.out.print("введите максимальный объем видеопамяти: ");
        double input = askDouble();
        return input;
    }
    private static double askMin_gpu_memory() {
        System.out.print("введите минимальный объем видеопамяти: ");
        double input = askDouble();
        return input;
    }
    private static int askMax_hdd_memory() {
        System.out.print("введите максимальный объем жесткого диска: ");
        int input = askInteger();
        return input;
    }
    private static int askMin_hdd_memory() {
        System.out.print("введите минимальный объем жесткого диска: ");
        int input = askInteger();
        return input;
    }
    private static double askMax_price() {
        System.out.print("введите максимальную стоимость: ");
        double input = askDouble();
        return input;
    }
    private static double askMin_price() {
        System.out.print("введите минимальную стоимость: ");
        double input = askDouble();
        return input;
    }

    // Группа методов для принятия значений разных форматов от пользователя

    private static String askString() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }
    private static int askInteger() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        try {
            return Integer.parseInt(str);
        } catch (Exception ignored) {}
        return 0;
    }
    private static double askDouble() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        try {
            return Double.parseDouble(str);
        } catch (Exception ignored) {}
        return 0.0;
    }
}