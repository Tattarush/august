package day13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int target = 12;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Угадай какое число я загадал");
            while (true) {
                System.out.println("Введи число");
                if (!scanner.hasNextInt()) {
                    System.out.println("Это не число!");
                    scanner.next();
                    continue;
                }
                int num = scanner.nextInt();
                if (num == target) {
                    System.out.println("Бинго!");
                    break;
                } else {
                    System.out.println("Не угадал , попробуй снова");
                }
            }
        }
    }
}
