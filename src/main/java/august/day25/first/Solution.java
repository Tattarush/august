package august.day25.first;

public class Solution {
    public static void main(String[] args) throws java.io.IOException {


        System.out.println("Введите S для выхода из цикла");
        for (int i = 0; (char) System.in.read() != 'S'; i++) {
            System.out.println("Проход номер " + i);
            System.in.skip(System.in.available());
        }

    }
}
