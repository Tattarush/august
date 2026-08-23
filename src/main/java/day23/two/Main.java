package day23.two;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            char ch;

            System.out.println("Введи символ");
            ch = (char) System.in.read();

            System.out.println("Ты ввел символ - "+ ch);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
