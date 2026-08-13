package day13;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> fails = new ArrayList<>();

        Random random = new Random();
        int target = random.nextInt(20);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Угадай какое число я загадал от 1 до 20");
            while (true) {
                System.out.println("Введи число");
                if (!scanner.hasNextInt()) {
                    System.out.println("Это не число!");
                    scanner.next();
                    continue;
                }
                int num = scanner.nextInt();
                if (num < 1 || num > 20) {
                    System.out.println("Вышел за рамки диапазона");
                }
                if (num < target) {
                    fails.add(num);
                    System.out.println("Неа! Число больше");
                }
                if (num > target) {
                    fails.add(num);
                    System.out.println("Неа! Число меньше");
                }
                if (num == target) {
                    System.out.println("Бинго!");
                    break;
                }
            }
        }
        System.out.println("Твои попытки: ");
        System.out.println(fails);
    }
}
