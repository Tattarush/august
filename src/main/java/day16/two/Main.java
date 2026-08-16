package day16.two;

/*Видоизмените программу, созданную в упражнении 1.2, таким образом, чтобы
она выводила таблиuу перевода дюймов в метры. Выведите значения длины до
12 футов через каждый дюйм. После каждых 12 дюймов выведите пустую строку.
(Один метр приблизительно равен 39,37 дюйма.)*/

public class Main {
    public static void main(String[] args) {

        double inch, m;
        int count = 0;

        for (inch = 1; inch <= 144; inch++) {
            m = inch / 39.37;
            System.out.printf("%.2f дюймов будет %.2f в метрах\n", inch, m);
            count++;
            if (count == 12) {
                System.out.println();
                count = 0;
            }
        }
    }
}
