import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1_1();
        task1_2();
        task1_3();
        task1_3_1();
        task2_1();
        task2_2();
        task2_3();
        task2_4();
        task3_1();
        task3_2();

    }
    public static void task1_1 () {
        System.out.println("Домашнее задание - 1. Задание 1");
        int salary = 65_535;
        int total = 0;
        int i = 0;
        for (; total < 2_459_000; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total);
        }
        System.out.println();
    }
    public static void task1_2 () {
        System.out.println("Домашнее задание - 1. Задание 2");
        int l = 0;
        while (l < 10) {
          l++;
          System.out.print(l +  " ");
           }
          System.out.println();

        for (int i = 10; i >= 1; i--) {
         System.out.print(i + " ");
           }
          System.out.println();
        System.out.println();

    }

    public static void task1_3 (){
        System.out.println("Домашнее задание - 1. Задание 3");
        System.out.println("Вариант цикла с оператором for");
        int populationSize = 12_000_000; // численность населения
        int birthRate = populationSize / 1000 * 17; // рождаемость
        int mortality = populationSize / 1000 * 8; // смертность
        for (int i = 1; i < 10; i++) {
            populationSize = populationSize + birthRate - mortality;
            System.out.println("Год " + i + ", численность населения составляет " + populationSize + " человек");
        }
    }
    public static void task1_3_1 () {
        System.out.println();
        System.out.println("Вариант цикла с оператором while");
        int populationSize = 12_000_000; // численность населения
        int birthRate = populationSize / 1000 * 17; // рождаемость
        int mortality = populationSize / 1000 * 8; // смертность
        int i = 1;
        while (i < 10) {
            i++;
            populationSize = populationSize + birthRate - mortality;
            System.out.println("Год " + i + ", численность населения составляет " + populationSize);
            }
        System.out.println();
    } public static void task2_1() {
        System.out.println("Домашнее задение-2. Задание 1");
        int contribution = 15_000;
        DecimalFormat df = new DecimalFormat("###.##");
        double total = 0;
        for (int i = 0; total < 12_000_000; i++) {
            total = total + total * 0.07;
            total = total + contribution;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + df.format(total));
        }
        System.out.println();


    }
    public static void task2_2 () {
        System.out.println("Домашнее задение-2. Задание 2");
        int contribution = 15_000;
        DecimalFormat df = new DecimalFormat("###.##");
        double total = 0;
        for (int i = 0; total < 12_000_000; i++) {
            total = total + total * 0.07;
            total = total + contribution;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + df.format(total));

            }

        }
        System.out.println();

    }
    public static void task2_3 () {
        System.out.println("Домашнее задение-2. Задание 3");
        int contribution = 15_000;
        DecimalFormat df = new DecimalFormat("###.##");
        double total = 0;
        for (int i = 0; i < 108; i++) {
            total = total + total * 0.07;
            total = total + contribution;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + df.format(total));
            }
        }
        System.out.println();
    }
    public static void task2_4 () {
        System.out.println("Домашнее задение-2. Задание 4");
        for (int i = 2; i < 32; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");

        }
        System.out.println();


    }
    public static void task3_1 () {
        System.out.println("Домашнее задение-3. Задание 1");
        int i = 0;
        int current = 2022;
        int before = current - 200;
        int after = current + 100;
        do {if (i > before && i < after)
            System.out.println(i);
        i += 79;
        }
           while (i < after);
           System.out.println();

    }
    public static void task3_2 () {
        System.out.println("Домашнее задение-3. Задание 2");
        int meaning = 2;
        for (int i = 1; i < 11; i++) {
            int result = meaning * i;
            System.out.println(meaning + " * " + i + " = " + result);
        }
        System.out.println();
    }

}
