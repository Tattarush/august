package day23.two;

public class Solution {
    public static void main(String[] args) throws java.io.IOException {

        char ch, answer = 'S';

        System.out.println("Загадана буква латинского алфавита A-Z, угадай какая\nВведи свой вариант - ");
        ch = (char) System.in.read();

        if (ch == answer) {
            System.out.println("Угадал!");
        } else {
            System.out.println("Неа, не угадал");
            if (ch < answer) {
                System.out.println("Буква ближе к началу");
            } else {
                System.out.println("Буква ближе к концу алфавита");
            }
        }
    }
}
