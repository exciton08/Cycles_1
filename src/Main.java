public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Задание 3");
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Задание 5");
        for (int year = 1899; year <= 2105; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                System.out.println(year + " является висококосным");
        }

        System.out.println();
        System.out.println("Задание 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("Задание 7");
        int number = 1;
        System.out.print(number + " ");
        for (int i = 0; i < 9; i++) {
            number = number * 2;
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("Задание 8");
        int part = 29_000;
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum += part;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }

        System.out.println();
        System.out.println("Задание 9");
        double sumWithPercent = 0;
        double percent = 0.01;
        for (int i = 1; i <= 12; i++) {
            sumWithPercent = (sumWithPercent + part) * (1 + percent);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumWithPercent + " рублей");
        }
    }
}