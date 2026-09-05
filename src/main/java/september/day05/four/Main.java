package september.day05.four;

public class Main {
    public static void main(String[] args) {

        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch);
            ch = (char) ((int) ch & 65503);
            System.out.print(ch+" ");
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);
            ch = (char) ((int) ch | 32);
            System.out.print(ch + " ");
        }
    }
}
