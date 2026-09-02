package august.day15;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Double num = random.nextDouble() * 100;

        if (Math.abs(num) < 0.0001) {
            System.out.println("выпал 0");
            System.out.println(num);
        } else {
            num = num / 2;
            System.out.printf("выпал %.2f", num);
        }
    }
}
