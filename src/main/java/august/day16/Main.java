package august.day16;

/*Сила тяжести на Луне составляет около 17% земной. Напишите программу, которая вычислила бы ваш вес на Луне.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double ves = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введи свой вес ");
            ves = scanner.nextDouble();

        }
        double vesMoon = ves * 0.17;
        System.out.printf("Твой вес на луне будет - %.2f",vesMoon);
    }
}
