package august.day28.two;


/*Напишите программу, которая получает символы,
 введенные с клавиатуры, до тех пор, пока не встретится точка.
 Предусмотрите в программе счетчик пробелов.
 Сведения о количестве пробелов должны выводиться в конце программы.*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws java.io.IOException {

        ArrayList<Character> list = new ArrayList<>();

        char ch;
        int count = 0;

        System.out.println("Введите символ");
        do {
            ch = (char) System.in.read();
            if (ch == ' ') {
                count++;
            }
            if (ch != '\n' && ch != '\r') {
                list.add(ch);
            }
        } while (ch != '.');


        StringBuilder st = new StringBuilder();
        for (Character cha : list) {
            st.append(cha);
        }
        System.out.println(st);
        System.out.println("Количество введенных пробелов = " + count);

    }
}
