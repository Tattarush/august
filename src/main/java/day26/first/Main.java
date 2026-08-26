package day26.first;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        char ch;


        do {
            System.out.println("Нажмите клавишу q для выхода");
            ch = (char) System.in.read();
            System.in.skip(System.in.available());
        } while (ch != 'q');
    }
}
